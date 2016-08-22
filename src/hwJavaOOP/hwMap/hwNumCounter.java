package hwJavaOOP.hwMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Numbers Counter (*). Задан List<Integer> list. Посчитать, сколько раз в списке попадается каждое число.
 * Подсказка: HashMap.
 */
public class hwNumCounter {
    public static void main(String[] args) {
        int[] arr = new int[20];

        arr = setArray(arr);

        HashMap<Integer, Integer> map = countNumbers(arr);

        printCounts(map);
    }

    private static void printCounts(HashMap<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            System.out.println(it.getKey() + (it.getValue() == 1 ? " is unique." : (" repeats " + it.getValue() + " times.")));
        }
    }

    private static HashMap<Integer, Integer> countNumbers(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            Integer count = map.get(i);
            map.put(i, count == null ? 1 : ++count);
        }
        return map;
    }

    private static int[] setArray(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = r.nextInt(10);
        }
        return arr;
    }
}
