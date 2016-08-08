package hwJavaOOP.rectaclehw;
//Rectangle (*). Написать класс Rectangle (Прямоугольник), содержащий размеры (высоту и ширину),
// и умеющий подсчитывать свои периметр и площадь. Написать клиентский класс RectangleRunner,
// создающий список прямоугольников и подсчитывающий их суммарную площадь.


public class Rectangle {

    private final int length;
    private final int width;

    private final int area;
    private final int perimeter;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        this.area = this.length * this.width;
        this.perimeter = (this.length + this.width) * 2;
    }

    public int getArea() {
        return this.area;
    }

    public int getPerimeter() {
        return this.perimeter;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

}
