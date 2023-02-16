import org.w3c.dom.css.Rect;

import java.awt.Rectangle;
import java.sql.Array;
import java.util.ArrayList;

public class BigRectLister {
    //CollectAll method takes in an ArrayList<Rectangle> and a Filter called "filter"
    //If the filter returns true for object in notChecked ArrayList<String>, it adds it into an
    //accepted arraylist. The method returns the accepted arraylist.
    public static ArrayList<Rectangle> collectAll(ArrayList<Rectangle> notChecked, Filter filter) {
        ArrayList<Rectangle> accepted = new ArrayList<>();
        for (Rectangle obj : notChecked) {
            if (filter.accept(obj)) {
                accepted.add(obj);
            }
        }
        return accepted;
    }
    public static void main(String[] args) {

        //Generates 10 rectangles
        ArrayList<Rectangle> rects = new ArrayList<>();
        rects.add(new Rectangle(5, 10));
        rects.add(new Rectangle(1, 1));
        rects.add(new Rectangle(20, 10));
        rects.add(new Rectangle(3, 2));
        rects.add(new Rectangle(9, 10));
        rects.add(new Rectangle(2, 1));
        rects.add(new Rectangle(12, 2));
        rects.add(new Rectangle(1, 3));
        rects.add(new Rectangle(8, 8));
        rects.add(new Rectangle(4, 4));

        Filter filter = new BigRectangleFilter();
        rects = collectAll(rects, filter);
        System.out.println("Big Rectangles:");
        for (Rectangle r : rects) {
            System.out.println((r.height*2+r.width*2));
        }
    }
}
