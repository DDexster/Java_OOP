package hwJavaOOP.hwFileSystem;

/**
 * Created by ddexster on 04.08.16.
 */
public class File extends abstractFSItem {

    private int size;


    public File(int size) {
        this.size = size;
    }

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    public File setSize(int size) {
        this.size = size;
        return this;
    }

    public String toString() {
        String s=getName()+" ("+getSize()+" B)\n";
        return s;
    }
}
