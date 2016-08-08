package classesOOP.lesson02;

/**
 * Created by ddexster on 19.07.16.
 */
public class Dog {
    private String name;
    private String ownerName;

    public Dog(String name, String ownerName) {
        checkName(name);
        checkName(ownerName);
        this.name = name;
        this.ownerName = ownerName;
    }

    public void bark() {
        System.out.println(name + ": Bark-bark!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        checkName(name);
        this.ownerName = ownerName;
    }

    private void checkName(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("illegal argument");
        }
    }

    private boolean isEmpty(String name) {
        return name == null || name.isEmpty();
    }

    @Override
    public String toString() {
        return "The Dog's name is " + name + ", owner's name is " + ownerName + "!";
    }
}
