package hwJavaOOP.hwPointLine;

import java.util.Random;

public class ImmPoint {
    private Random rand = new Random();
    private final int x = rand.nextInt(20);
    private final int y = rand.nextInt(20);

    public ImmPoint() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y +
                '}';
    }
}
