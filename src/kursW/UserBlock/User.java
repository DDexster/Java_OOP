package kursW.UserBlock;

/**
 * Created by ddexster on 16.08.16.
 */
public class User extends AUser {
    protected static long count = 0;
    private final long ID;
    private String nick;
    private int age;

    public User() {
        this.ID = count++;
    }

    public User(String nick, int age) {
        this.ID = count++;
        this.nick = nick;
        this.age = age;
    }
}
