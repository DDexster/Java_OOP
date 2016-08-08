package hwJavaOOP.hwFileSystem;

/**
 * Created by ddexster on 04.08.16.
 */
public abstract class abstractFSItem implements FSItem {
    private String name;
    private int level=0;
    public abstractFSItem() {
    }

    public abstractFSItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public abstractFSItem setName(String name) {
        this.name = name;
        return this;
    }

    public int getLevel() {
        return level;
    }

    public abstractFSItem setLevel(int level) {
        this.level = level;
        return this;
    }
}
