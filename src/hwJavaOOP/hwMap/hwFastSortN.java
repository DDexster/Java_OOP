package hwJavaOOP.hwMap;

import java.util.*;

public class hwFastSortN {
    public static void main(String[] args) {
        int[] arr = new int[10_000];
        arr = setArray(arr);

        List<Integer> sortedList = fastSort(arr);
        System.out.println(sortedList.toString());
    }

    //Сортировка со сложностью О(3N)
    private static List<Integer> fastSort(int[] arr) {
        // Переносим значения в ХэшМап проход по массиву O(N), вставка значений в ХэшМап O(1) итого получаем = O(N)
        Hashtable<Integer, ArrayList<Integer>> hashtable = new Hashtable<>();
        for (int i : arr)
            if (!hashtable.containsKey(i)) {
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(i);
                hashtable.put(i, integers);
            } else hashtable.get(i).add(i);

        // Перенос значений из Хэша в ТриМап O(logN) итого на текущий момент = O(N)+O(1)+O(logN) (при суммировании логарифмом можно принебречь)
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        for (Map.Entry<Integer, ArrayList<Integer>> entry : hashtable.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        // И наконец вставка отсортированных элементов в связный массив:
        // Добавление в связный массив O(1), Проход по Динамическому массиву O(N) итого = O(2N)+O(2)+O(logN)
        List<Integer> result = new LinkedList<>();
        for (ArrayList<Integer> integers : map.values()) {
            for (Integer integer : integers) result.add(integer);
        }
        return result;
    }

    private static int[] setArray(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        return arr;
    }
}