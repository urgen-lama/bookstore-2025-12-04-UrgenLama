package csd214.bookstore.pojos;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public abstract class Editable implements Serializable, SaleableItem {
    protected Scanner input = new Scanner(System.in);

    public abstract void edit();
    public abstract void initialize();

    public void setScanner(Scanner scanner) {
        this.input = scanner;
    }

    public String getInput(String defaultValue) {
        if (!input.hasNextLine()) return defaultValue;
        String s = input.nextLine();
        return s.trim().isEmpty() ? defaultValue : s;
    }

    public int getInput(int defaultValue) {
        try {
            if (!input.hasNextLine()) return defaultValue;
            String s = input.nextLine().trim();
            return s.isEmpty() ? defaultValue : Integer.parseInt(s);
        } catch (Exception e) { return defaultValue; }
    }

    public double getInput(double defaultValue) {
        try {
            if (!input.hasNextLine()) return defaultValue;
            String s = input.nextLine().trim();
            return s.isEmpty() ? defaultValue : Double.parseDouble(s);
        } catch (Exception e) { return defaultValue; }
    }

    public boolean getInput(boolean defaultValue) {
        try {
            if (!input.hasNextLine()) return defaultValue;
            String s = input.nextLine().trim();
            return s.isEmpty() ? defaultValue : Boolean.parseBoolean(s);
        } catch (Exception e) { return defaultValue; }
    }

    public Date getInput(Date defaultValue) {
        if (!input.hasNextLine()) return defaultValue;
        String s = input.nextLine().trim();
        if (s.isEmpty()) return defaultValue;

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        try {
            return formatter.parse(s);
        } catch (ParseException e) {
            return defaultValue;
        }
    }

    public LocalDate getInput(LocalDate defaultValue) {
        if (!input.hasNextLine()) return defaultValue;
        String s = input.nextLine().trim();
        if (s.isEmpty()) return defaultValue;

        try {
            return LocalDate.parse(s, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        } catch (Exception e) {
            return defaultValue;
        }
    }
}