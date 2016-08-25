package hwJavaOOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ddexster on 16.08.16.
 */
public class hwPersonListSort {
    public static void main(String[] args) {
        List<Person> persons = createList();

        printList(persons);

        List<Person> teens = filterTeensLambda(persons);

//        List<Person> teens = filterTeens(persons);

        System.out.println("Teens:");
        printList(teens);

    }

    private static List<Person> filterTeens(List<Person> persons) {
        List<Person> teens = new ArrayList<>();

        for (Person person : persons) {
            if (person.getAge() >= 12 && person.getAge() <= 17) teens.add(person);
        }

        Collections.sort(teens, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() == o2.getAge()) return o1.getName().compareTo(o2.getName());
                else return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        return teens;
    }

    private static List<Person> filterTeensLambda(List<Person> persons) {
        List<Person> teens = persons
                .stream()
                .filter(person -> person.getAge() >= 12 && person.getAge() <= 17)
                .collect(Collectors.toList());
        teens = teens
                .stream()
                .sorted((p1, p2) -> p1.getAge() != p2.getAge() ?
                        Integer.compare(p1.getAge(), p2.getAge()) : p1.getName().compareTo(p2.getName()))
                .collect(Collectors.toList());
        return teens;
    }

    private static void printList(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println();
    }

    private static List<Person> createList() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jonh", 25, "male"));
        persons.add(new Person("Tim", 16, "male"));
        persons.add(new Person("Miranda", 17, "female"));
        persons.add(new Person("Carry", 23, "female"));
        persons.add(new Person("Michael", 16, "male"));
        persons.add(new Person("Rodney", 18, "male"));
        persons.add(new Person("Carla", 13, "female"));
        return persons;
    }

    private static class Person {
        private String name;
        private int age;
        private String sex;

        public Person(String name, int age, String sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSex() {
            return sex;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex='" + sex + '\'' +
                    '}';
        }
    }
}
