package hwJavaOOP.rectaclehw;
//Написать клиентский класс RectangleRunner,
// создающий список прямоугольников и подсчитывающий их суммарную площадь.

import java.util.Scanner;

public class RectangleRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько прямоугольников вы хотите добавить?: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Введите длинну прямоугольника " + (i + 1) + ", м: ");
            int a = sc.nextInt();
            System.out.println("Введите ширину прямоугольника " + (i + 1) + ", м: ");
            int b = sc.nextInt();
            Rectangle rect = new Rectangle(a, b);
            sum += rect.getArea();
        }
        System.out.println("Суммарная площадь прямоугольников равна: " + sum + " м2.");
    }
}
