import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BigRectListerTest {

    @Test
    void collectAll() {
        Filter filter = new BigRectangleFilter();
        ArrayList<Rectangle> testArray = new ArrayList<Rectangle>() {
            {
                add(new Rectangle(1, 1, 1, 1));
                add(new Rectangle(10, 10, 10, 10));
                add(new Rectangle(2, 2, 2, 2));
            }
        };
        testArray = BigRectLister.collectAll(testArray, filter);
        assertEquals("[java.awt.Rectangle[x=10,y=10,width=10,height=10]]", testArray.toString());
    }
}