package hwJavaOOP.hwFileSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ddexster on 04.08.16.
 */
public class Directory extends abstractFSItem {
    private List<FSItem> list = new ArrayList<>();

    public Directory() {
    }

    public Directory(String name) {
        super(name);
    }

    public Directory add(FSItem item) {
        list.add(item);

        return this;
    }

    @Override
    public int getSize() {
        int sum = 0;
        for (FSItem item : list) {
            sum += item.getSize();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getName()).append("\n");
        for (int i = 0; i < list.size(); i++) {
            sb.append("|---").append(list.get(i));
        }
        return sb.toString();
    }
}
