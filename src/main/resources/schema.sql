-- Table 1: Stationery
CREATE TABLE IF NOT EXISTS stationery (
    id INT AUTO_INCREMENT PRIMARY KEY,
    brand VARCHAR(255),
    type VARCHAR(255),
    color VARCHAR(50),
    page_count INT,
    price DOUBLE
    );

-- Table 2:
CREATE TABLE IF NOT EXISTS guitars (
    id INT AUTO_INCREMENT PRIMARY KEY,
    brand VARCHAR(255),
    string_count INT,
    price DOUBLE
    );