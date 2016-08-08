package classesOOP.lesson01;

/**
 * @author bvanchuhov
 */
public class StoringSample {

    public static void main(String[] args) {
        int x = 10;
        int y = x;
        System.out.println("primitives: " + (x == y));

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println("ref: " + (s1 == s2));
        System.out.println("objects: " + s1.equals(s2));
    }
}
