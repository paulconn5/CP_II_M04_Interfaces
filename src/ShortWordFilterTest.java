import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ShortWordFilterTest {

    @Test
    void accept() {
        ShortWordFilter filter = new ShortWordFilter();
        String tested = "NotValid";
        boolean actualResult = filter.accept(tested);
        assertEquals(false, actualResult);
    }
}