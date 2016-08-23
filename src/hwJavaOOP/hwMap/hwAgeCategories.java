package hwJavaOOP.hwMap;

import classesOOP.lesson01.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Age Categories for Persons (**). Задан List<Person> persons. Создать структуру, позволяющую быстро выполнять запросы:
 * 1. Найти всех людей подроствого возраста (от 12 до 17 лет).
 * 2. Найти младшего человека, старше 18 лет.
 * 3. Найти старшего человека, младше 18 лет.
 * Продемонстрировать работу этих запросов и оценить сложность.
 * Подсказка: TreeMap.
 */
public class hwAgeCategories {
    public static void main(String[] args) {
        ArrayList<Person> persons = createList();
        TreeMap<Integer, List<Person>> map = (TreeMap) transferToMap(persons);

        // 1. Найти всех людей подроствого возраста (от 12 до 17 лет). O(log(n))
        System.out.println(map.subMap(12, 18));

        // 2. Найти младшего человека, старше 18 лет. O(log(n))
        System.out.println(map.ceilingEntry(18));

        // 3. Найти старшего человека, младше 18 лет. O(log(n))
        System.out.println(map.floorEntry(18));

    }

    private static Map<Integer, List<Person>> transferToMap(ArrayList<Person> persons) {
        Map<Integer, List<Person>> map = new TreeMap<>();
        for (Person person : persons) {
            if (!map.containsKey(person.getAge())) {
                List<Person> list = new ArrayList<>();
                list.add(person);
                map.put(person.getAge(), list);
            } else {
                map.get(person.getAge()).add(person);
            }
        }
        return map;
    }

    private static ArrayList<Person> createList() {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Jonh", 25));
        persons.add(new Person("Tim", 13));
        persons.add(new Person("Linda", 23));
        persons.add(new Person("Riley", 17));
        persons.add(new Person("Mike", 14));
        persons.add(new Person("Gina", 12));
        persons.add(new Person("Ivan", 17));
        persons.add(new Person("Kimberley", 14));
        persons.add(new Person("Rick", 8));
        persons.add(new Person("Jacklin", 19));
        persons.add(new Person("Tom", 16));
        persons.add(new Person("Lilly", 21));
        return persons;
    }
}
