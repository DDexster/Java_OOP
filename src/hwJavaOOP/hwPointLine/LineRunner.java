package hwJavaOOP.hwPointLine;

import java.util.ArrayList;
import java.util.Scanner;

public class LineRunner {
    public static void main(String[] args) {
        ArrayList<ImmLine> lines = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Сколько линий вам создать?: ");
        int n = sc.nextInt();

        LineUtils.createLines(lines, n);

        double sumLength = LineUtils.getSumLineLength(lines);

        printList(lines);

        LineUtils.printLenghts(lines);

        System.out.println();
        System.out.println("Самая длинная: " + lines.get(LineUtils.findLongest(lines)) + ", ее длинна равна - "
                + String.format("%.2f", lines.get(LineUtils.findLongest(lines)).getLineLength()));
        System.out.println();
        System.out.println("Суммарная длинна перечисленных линий равна: " + String.format("%.2f", sumLength));
    }

    private static void printList(ArrayList<ImmLine> lines) {
        for (ImmLine l : lines) {
            System.out.println(l);
        }
    }

}
