package hwJavaOOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ddexster on 16.08.16.
 */
public class hwCollectionsSort {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mark");
        names.add("Tim");
        names.add("Alvis");
        names.add("Cartman");
        names.add("Stan");
        names.add("Kyle");
        System.out.println("Start list: ");
        printList(names);

        // Sort by name

        sortByName(names);
        printList(names);

        //Sort by name in reverse

        sortByNameInReverse(names);
        printList(names);

        //Find min name with Collections.min()

        findMin(names);

        //Sort by letters number

        sortByLettersNumber(names);
        printList(names);

        //Sort by letters number with lambda

        names = sortByLettersNumberLambda(names);
        printList(names);

        //Sort by letters numbers than Alphabetical

        sortByLetNumThenAlphabet(names);
        printList(names);

        // Sort by letters numbers than Alphabetical with lambda

        names = sortByLetNumThenAlphabetLambda(names);
        printList(names);


    }

    private static List<String> sortByLetNumThenAlphabetLambda(List<String> names) {
        names = names
                .stream()
                .sorted((s1, s2) -> s1.length() != s2.length() ?
                        Integer.compare(s1.length(), s2.length()) : s2.compareTo(s1))
                .collect(Collectors.toList());
        System.out.println("Sort by letters numbers than Alphabetical: ");
        return names;
    }

    private static void sortByLetNumThenAlphabet(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int comp = Integer.compare(o1.length(), o2.length());
                if (comp == 0) return o2.compareTo(o1);
                else return comp;
            }
        });
        System.out.println("Sort by letters numbers than Alphabetical: ");
    }

    private static List<String> sortByLettersNumberLambda(List<String> names) {
        names = names
                .stream()
                .sorted((String s1, String s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());
        System.out.println("Sort by letters number:");
        return names;
    }

    private static void sortByLettersNumber(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        System.out.println("Sort by letters number:");
    }

    private static void findMin(List<String> names) {
        System.out.println("Find min name with Collections.min()");
        System.out.println(Collections.min(names) + "\n");
    }

    private static void sortByNameInReverse(List<String> names) {
        System.out.println("Sort by name in reverse:");
        Collections.sort(names, Collections.reverseOrder());
    }

    private static void sortByName(List<String> names) {
        System.out.println("Sort by name:");
        Collections.sort(names);
    }

    private static void printList(List list) {
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println();
    }
}
