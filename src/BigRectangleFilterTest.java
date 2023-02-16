import static org.junit.jupiter.api.Assertions.*;
import java.awt.Rectangle;

class BigRectangleFilterTest {

    @org.junit.jupiter.api.Test
    void accept() {
        BigRectangleFilter filter = new BigRectangleFilter();
        Rectangle rectangle = new Rectangle(1,1,1,1);
        boolean actualResult = filter.accept(rectangle);
        assertEquals(false, actualResult);
    }
}