package classesOOP.lesson02.familyCar;

/**
 * @author Bohdan Vanchuhov
 */
public class FamilyCarSample {
    public static void main(String[] args) {
        Car husbandCar = new Car();
        System.out.println(husbandCar);

        Car wifeCar = husbandCar;
        wifeCar.setColor(Car.PINK);

        System.out.println(husbandCar);
    }
}

class Car {
    public static final int BLACK = 0;
    public static final int PINK = 1;

    private int color = BLACK;

    public Car() {
    }

    public static String getColorName(int color) {
        switch (color) {
            default:
            case BLACK:
                return "Black";
            case PINK:
                return "Pink";
        }
    }

    @Override
    public String toString() {
        return getColorName(color) + " car";
    }

    //----- Getters and Setters -----

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
