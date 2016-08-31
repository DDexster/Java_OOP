package hwJavaOOP.hwFactorial;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class hwFactorialNormal {
    private static final int N = 100;
    private static final int K = 1000;

    public static void main(String[] args) {

        singleThreadOutput();

        multiThreadOutput();
    }

    private static void multiThreadOutput() {
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 1; i <= N; i++) {
            int finalI = i;
            executorService.submit(() -> outputFactorialToFile(K * finalI));
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(5, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long stop = System.currentTimeMillis();
        System.out.println("Multithreaded operation completed in " + (stop - start) + " ms");
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
