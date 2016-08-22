package hwJavaOOP.hwMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//Найти уникальные числа в массиве

public class hwUniqueInArr {
    public static void main(String[] args) {
        int[] arr = new int[50];
        arr = setArray(arr);
        ArrayList<Integer> unique = findUnique(arr);
        System.out.println("Unique numbers are: " + unique);
    }

    private static ArrayList<Integer> findUnique(int[] arr) {
        HashMap<Integer, Integer> mapCount = new HashMap<>();
        for (int i : arr) {
            Integer count = mapCount.get(i);
            mapCount.put(i, count == null ? 1 : ++count);
        }
        ArrayList<Integer> uniques = new ArrayList<>();
        for (Map.Entry<Integer, Integer> i : mapCount.entrySet()) {
            if (i.getValue() == 1) uniques.add(i.getKey());
        }
        return uniques;
    }

    private static int[] setArray(int[] arr) {
        Random r = new Random();
        arr[49] = 15;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = r.nextInt(10);
        }
        return arr;
    }

}
