package hwJavaOOP.hwFactorial;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

public class hwFactorial {
    private static final int N = 100;
    private static final int K = 1000;

    public static void main(String[] args) {
        singleThreadOutput();
        multiThreadOutput();
    }

    private static void multiThreadOutput() {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= N; i++) {
            int finalI = i;
            if (finalI == N) {
                outputFactorialToFile(K * finalI);
                long stop = System.currentTimeMillis();
                System.out.println("Multithreaded operation completed in " + (stop - start) + " ms");
            } else {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        outputFactorialToFile(K * finalI);
                    }
                }).start();
            }
        }

    }

    private static void singleThreadOutput() {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= N; i++) {
            outputFactorialToFile(K * i);
        }
        long stop = System.currentTimeMillis();
        System.out.println("Single threaded operation completed in " + (stop - start) + " ms");

    }

    private static void outputFactorialToFile(int n) {
        String filename = "src/hwJavaOOP/hwFactorial/factorial " + n + ".txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println(getFactorial(n).toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static BigInteger getFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
