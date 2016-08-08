package hwJavaOOP.hwPuppy;

public class Dog extends Animal {
    private int tailLength;

    public Dog(String name, double age, int tailLength) {
        super(name, age);
        super.setNumOfPaws(4);
        this.tailLength = tailLength;
    }

    public static void doBite() {
        System.out.println("You've bitten!");
    }

    public static void doBark() {
        System.out.println("Bark-bark!");
    }

    public int getTailLength() {
        return tailLength;
    }

    public Dog setTailLength(int tailLength) {
        this.tailLength = tailLength;
        return this;
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                "tailLength=" + tailLength +
                "} ";
    }

}
