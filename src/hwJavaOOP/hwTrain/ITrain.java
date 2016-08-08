package hwJavaOOP.hwTrain;

/**
 * Created by ddexster on 08.08.16.
 */
public interface ITrain {

    void turnLeft();

    void turnRight();

    void lightOn();

    void lightOff();

    boolean isLightOn();

    boolean isLength(int expectedLength);
}
