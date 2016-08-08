package classesOOP.lesson03.rectangle;

/**
 * @author bvanchuhov
 */
public class Rectangle {

    private final int height;
    private final int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getPerimeter() {
        return 2 * (height + width);
    }

    public int getArea() {
        return height * width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
