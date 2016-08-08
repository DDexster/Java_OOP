package hwJavaOOP.hwPointLine;

public class ImmLine {
    private final ImmPoint a = new ImmPoint();
    private final ImmPoint b = new ImmPoint();

    public ImmLine() {
    }

    public double getLineLength() {
        return Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
    }

    public ImmPoint getA() {
        return a;
    }

    public ImmPoint getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Линия {" +
                "Начальная точка=" + a +
                ", конечная точка " + b +
                '}';
    }
}
