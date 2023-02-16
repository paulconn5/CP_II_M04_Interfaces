import java.awt.Rectangle;

public class BigRectangleFilter implements Filter {
    @Override
    public boolean accept(Object x) {
        //Cast Object X as a rectangle
        Rectangle r = (Rectangle) x;
        if ((r.height*2)+(r.width*2) > 10) {
            return true;
        } else {return false;}
    }
}

