package classesOOP.lesson02.JavaOOP_Encapsulation.src.ua.kiev.prog.javaoop.encapsulation._2_with_constructor;

/**
 * @author Bohdan Vanchuhov
 */
public class WithConstructorSample {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
