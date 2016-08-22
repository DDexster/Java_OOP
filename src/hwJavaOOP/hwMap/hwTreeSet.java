package hwJavaOOP.hwMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

/**
 * Unique Sorted Persons (*). Задан List<Person> pesons. Вывести людей в алфавитном порядке имен так, чтобы люди с одинаковыми именами не повторялись.
 * Подсказка: TreeSet.
 */
public class hwTreeSet {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("John", "Tim", "Alen", "Cindy", "Alex", "Zak",
                "Wendy", "Tiffany", "Helen", "Dorothy"));

        TreeSet<String> set = sortBySet(list);

        printItems(set);
    }

    private static void printItems(Collection<String> set) {
        for (String s : set) {
            System.out.println(s);
        }
    }

    private static TreeSet<String> sortBySet(ArrayList<String> list) {
        TreeSet<String> set = new TreeSet<>();
        for (String s : list) {
            set.add(s);
        }
        return set;
    }
}
