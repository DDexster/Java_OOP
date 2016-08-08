package classesOOP.lesson02.Person.goodPerson;

/**
 * @author bvanchuhov
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        checkAge(age);

        this.name = name;
        this.age = age;
    }

    public String sayHello() {
        return "Hello, I'm " + name + ", " + age + " years old";
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        checkAge(age);
        this.age = age;
        return this;
    }

    private void checkAge(int age) {
        if (!isAge(age)) {
            throw new IllegalArgumentException("illegal age");
        }
    }

    private boolean isAge(int age) {
        return age >= 1 && age <= 120;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
