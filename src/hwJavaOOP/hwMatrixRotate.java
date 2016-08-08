package hwJavaOOP;

//Блинов. Глава 2. Вариант C. 7. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.
/**
 * Created by ddexster on 18.07.16.
 */
public class hwMatrixRotate {
    static void drawMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void rotateM270(int[][] a) {
        int[][] b = new int[a.length][a.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = a[j][a.length - i - 1];
            }
        }
        System.out.println("This matrix is rotated by 270 degree:");
        drawMatrix(b);
    }

    static void rotateM90(int[][] a) {
        int[][] b = new int[a.length][a.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[j][i] = a[a.length - i - 1][j];
            }
        }
        System.out.println("This matrix is rotated by 90 degree:");
        drawMatrix(b);
    }

    static void rotateM180(int[][] a) {
        int[][] b = new int[a.length][a.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[j][i] = a[a.length - j - 1][a.length - i - 1];
            }
        }
        System.out.println("This matrix is rotated by 180 degree:");
        drawMatrix(b);
    }


    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Original matrix:");
        drawMatrix(a);
        rotateM270(a);
        rotateM90(a);
        rotateM180(a);


    }
}
