package classesOOP.lesson01;

import classesOOP.lesson01.Person;

/**
 * @author bvanchuhov
 */
public class PersonRunner {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 25;

        String infoMessage = getInfoMessage(person);
        System.out.println(infoMessage);
    }

    private static String getInfoMessage(Person person) {
        return "Hello, I'm " + person.name + ", " + person.age + " years old";
    }
}
