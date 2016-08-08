package classesOOP.lesson03.rectangle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class RectangleRunner {

    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(10, 20));
        rectangles.add(new Rectangle(30, 40));

        System.out.println("areaSum = " + RectangleUtils.areaSum(rectangles));

        RectangleUtils.printRectangles(rectangles);
    }
}
