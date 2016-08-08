package hwJavaOOP.hwPuppy;

public class Animal {
    private String name;
    private double age;
    private int numOfPaws;

    public Animal() {
    }

    public Animal(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public static void doJump() {
        System.out.println("Hop!");
    }

    public static void doRun() {
        System.out.println("Ta-Da-Dam Ta-Da-Dam!");
    }

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public double getAge() {
        return age;
    }

    public Animal setAge(double age) {
        this.age = age;
        return this;
    }

    public int getNumOfPaws() {
        return numOfPaws;
    }

    public Animal setNumOfPaws(int numOfPaws) {
        this.numOfPaws = numOfPaws;
        return this;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", numOfPaws=" + numOfPaws + ", ";
    }
}
