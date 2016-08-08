package hwJavaOOP;
// Блинов. Глава 2. Вариант A. 8. Ввести N чисел с консоли.
// Среди чисел найти число-палиндром. Если таких чисел больше одного,  найти второе.
// Подсказка: разделение ответственностей, каждый независимый функционал выносить в метод.

import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class hwPalindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Сколько чисел хотите ввести?: ");
        int n=sc.nextInt();
        String palindroms = null;
        System.out.println("Введите числа:");
        int [] a= new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
            String s1=Integer.toString(a[i]);
            if (s1.length() > 1 && isPalindrom(s1)) palindroms += (s1 + " ");
        }

        if (palindroms != null)
            System.out.println("Числа палиндромы: " + palindroms);
        else
            System.out.println("Среди введенных чисел палиндромы отсутствуют!");

    }

    static boolean isPalindrom (String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
            }
        return true;
    }
}
