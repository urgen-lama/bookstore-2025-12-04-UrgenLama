package csd214.bookstore.pojos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PianoTest {
    @Test
    void testPianoIdentity() {
        Piano p1 = new Piano();
        p1.setProductId("Yamaha");
        p1.setPrice(5000.0);

        Piano p2 = new Piano();
        p2.setProductId("Yamaha");
        p2.setPrice(5000.0);

        assertEquals(p1, p2);
    }
}