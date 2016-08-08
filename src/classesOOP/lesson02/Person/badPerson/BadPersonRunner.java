package classesOOP.lesson02.Person.badPerson;

/**
 * @author bvanchuhov
 */
public class BadPersonRunner {

    public static void main(String[] args) {
        BadPerson person = new BadPerson();
        person.name = "John";
        person.age = 25;

        int age = person.age;
        System.out.println("age = " + age);

        String personInfo = getPersonInfo(person);
        System.out.println(personInfo);
    }

    private static String getPersonInfo(BadPerson person) {
        return "I'm " + person.name + ", " + person.age + " years old";
    }
}
