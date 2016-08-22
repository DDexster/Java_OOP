package hwJavaOOP.hwMap;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

public class hwFastSort {
    public static void main(String[] args) {
        int[] arr = new int[10_000];
        arr = setArray(arr);

        ArrayList<Integer> sortedList = fastSort(arr);
        System.out.println(sortedList);
    }

    //Сортировка со сложностью О(2N)
    private static ArrayList<Integer> fastSort(int[] arr) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        for (int i : arr) {
            if (!map.containsKey(i)) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(i, list);
            } else {
                map.get(i).add(i);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (ArrayList<Integer> integers : map.values()) {
            for (Integer integer : integers) {
                result.add(integer);
            }
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