package csd214.bookstore.mysql;

import csd214.bookstore.pojos.Guitar;
import java.sql.*;

public class JdbcGuitarApp {
    private static final String URL = "jdbc:mysql://localhost:3333/bookstore";
    private static final String USER = "csd214";
    private static final String PASS = "itstudies12345";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            createTable(conn);

            System.out.println("--- INSERTING ---");
            Guitar g1 = new Guitar("Ibanez", 6, 1200.00);
            insertGuitar(conn, g1);

            System.out.println("--- READING ---");
            listGuitars(conn);

            System.out.println("--- UPDATING THE INVENTORY ---");
            updateGuitar(conn, 17, "Ibanez", 7, 899.99);

            System.out.println("--- DELETING ---");
            deleteGuitar(conn, 19);

            System.out.println("--- FINAL READING ---");
            listGuitars(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS guitars (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "brand VARCHAR(255), " +
                "string_count INT, " +
                "price DOUBLE)";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table 'guitars' ready.");
        }
    }

    private static void insertGuitar(Connection conn, Guitar g) throws SQLException {
        String sql = "INSERT INTO guitars (brand, string_count, price) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, g.getBrand());
            ps.setInt(2, g.getStringCount());
            ps.setDouble(3, g.getPrice());
            ps.executeUpdate();
            System.out.println("Saved: " + g.getBrand());
        }
    }

    private static void listGuitars(Connection conn) throws SQLException {
        String sql = "SELECT * FROM guitars";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.printf("ID: %d | Brand: %s | Strings: %d | Price: $%.2f%n",
                        rs.getInt("id"),
                        rs.getString("brand"),
                        rs.getInt("string_count"),
                        rs.getDouble("price"));
            }
        }
    }

    private static void updateGuitar(Connection conn, int id, String newBrand, int newStrings, double newPrice) throws SQLException {
        String sql = "UPDATE guitars SET brand = ?, string_count = ?, price = ? WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, newBrand);
            ps.setInt(2, newStrings);
            ps.setDouble(3, newPrice);
            ps.setInt(4, id);
            int rowsAffected = ps.executeUpdate();
            System.out.println("Updated " + rowsAffected + " row(s).");
        }
    }

    private static void deleteGuitar(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM guitars WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rowsAffected = ps.executeUpdate();
            System.out.println("Deleted " + rowsAffected + " row(s).");
        }
    }
}