package kursW.UserBlock;

/**
 * Created by ddexster on 16.08.16.
 */
public class User extends AUser {
    protected static long count=0;
    private String nick;
    private int age;
    private final long ID;

    public User() {
        this.ID=count++;
    }

    public User(String nick, int age) {
        this.ID=count++;
        this.nick = nick;
        this.age = age;
    }
}
