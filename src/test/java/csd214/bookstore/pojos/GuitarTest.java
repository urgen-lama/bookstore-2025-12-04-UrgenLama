package csd214.bookstore.pojos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuitarTest {
    @Test
    void testSellItemLogic() {
        Guitar g = new Guitar();
        g.setProductId("Gibson");
        assertDoesNotThrow(() -> g.sellItem());
    }
}