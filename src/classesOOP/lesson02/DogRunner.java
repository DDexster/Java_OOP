package classesOOP.lesson02;

/**
 * Created by ddexster on 19.07.16.
 */
public class DogRunner {

    public static void main(String[] args) {
        Dog rex = new Dog("Rex", "John");
        System.out.println(rex);
        rex.bark();
    }
}
