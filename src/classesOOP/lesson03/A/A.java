package classesOOP.lesson03.A;

/**
 * Created on 28.05.2015
 *
 * @author Bohdan Vanchuhov
 */
public class A {
        public static int staticX = initStaticX();

    private static int initStaticX() {
        System.out.println("INIT STATIC X");
        return 10;
    }

    private int x = initX();

    private int initX() {
        System.out.println("Init X");
        return 10;
    }

    static {
        System.out.println("STATIC BLOCK");
    }

    {
        System.out.println("Init block");
    }

    public A() {
        System.out.println("Constructor A()");
    }

    public A(int x) {
        this();
        System.out.println("Constructor A(int)");
    }
}

class ARunner {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(A.staticX);
        new A();
    }
}
