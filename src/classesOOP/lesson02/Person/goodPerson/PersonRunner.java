package classesOOP.lesson02.Person.goodPerson;

/**
 * @author bvanchuhov
 */
public class PersonRunner {

    public static void main(String[] args) {
        Person person = new Person("John", 25);
        System.out.println(person);

        String personInfo = person.sayHello();
        System.out.println(personInfo);
    }
}
