package hwJavaOOP.hwFileSystem;

/**
 * Created by ddexster on 04.08.16.
 */
public class FSRunner {
    public static void main(String[] args) {

        Directory root = new Directory("root")
                .add(new Directory("Dir1")
                        .add(new File("f1", 30))
                        .add(new File("f2", 50)))
                .add(new Directory("Dir2")
                        .add(new Directory("Dir3")
                                .add(new File("f3", 30)))
                        .add(new File("f4", 40)))
                .add(new File("f5", 100));
//        root.add(root);

        System.out.println(root);
        System.out.println("size= " + root.getSize());
    }
}
