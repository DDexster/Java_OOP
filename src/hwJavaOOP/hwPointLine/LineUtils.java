package hwJavaOOP.hwPointLine;

import java.util.ArrayList;

/**
 * Created by ddexster on 22.07.16.
 */
public class LineUtils {
    public LineUtils() {
    }

    static void createLines(ArrayList<ImmLine> lines, int n) {
        for (int i = 0; i < n; i++) {
            lines.add(new ImmLine());
        }
    }

    static double getSumLineLength(ArrayList<ImmLine> lines) {
        double sum = 0;
        for (int i = 0; i < lines.size(); i++) {
            sum += lines.get(i).getLineLength();
        }
        return sum;
    }

    static int findLongest(ArrayList<ImmLine> lines) {
        int lmax = 0;
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).getLineLength() > lines.get(lmax).getLineLength()) lmax = i;
        }
        return lmax;
    }

    static void printLenghts(ArrayList<ImmLine> lines) {
        System.out.println();
        for (int i = 0; i < lines.size(); i++) {
            System.out.println("Длинна " + (i + 1) + " линии равна " + String.format("%.2f", lines.get(i).getLineLength()));
        }
    }
}
