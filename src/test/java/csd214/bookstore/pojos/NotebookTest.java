package csd214.bookstore.pojos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotebookTest {
    @Test
    void testConstructorIntegrity() {
        Notebook n = new Notebook();
        n.setBrand("FiveStar");
        n.setPrice(4.50);
        assertEquals("FiveStar", n.getBrand());
        assertEquals(4.50, n.getPrice());
    }
}