package hwJavaOOP.hwFilm;

import java.io.Serializable;

public class Actor implements Serializable {


    private String name;
    private String secName;

    public Actor(String name, String secName) {
        this.name = name;
        this.secName = secName;
    }

    public String getName() {
        return name;
    }

    public Actor setName(String name) {
        this.name = name;
        return this;
    }

    public String getSecName() {
        return secName;
    }

    public Actor setSecName(String secName) {
        this.secName = secName;
        return this;
    }

    @Override
    public String toString() {
        return name + " " + secName;
    }
}
