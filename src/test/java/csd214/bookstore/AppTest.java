package csd214.bookstore;

import csd214.bookstore.pojos.Pen;
import csd214.bookstore.pojos.SaleableItem;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testAppFlow_AddPen() {

        String script = "1\n5\nBic\n1.50\nBlue\n99\n99\n";
        ByteArrayInputStream in = new ByteArrayInputStream(script.getBytes());


        App app = new App(new Scanner(in)) {
            @Override
            public void populate() {

            }
        };

        app.run();


        Pen expected = new Pen();
        expected.setBrand("Bic");
        expected.setPrice(1.50);

        SaleableItem found = app.findItem(expected);

        assertNotNull(found, "The Pen added via script should be in the items list.");
        assertEquals("Bic", ((Pen)found).getBrand());
    }
}