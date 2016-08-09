package hwJavaOOP.hwTrain;

/**
 * Created by ddexster on 08.08.16.
 */
public class Carriage {

    private boolean bulb;

    public Carriage(boolean bulb) {
        this.bulb = bulb;
    }

    public boolean isLightOn() {
        return this.bulb;
    }

    public void setLightOn() {
        this.bulb = true;
    }

    public void setLightOff() {
        this.bulb = false;
    }

    @Override
    public String toString() {
        return "Carriage{" +
                "Lights is " + (this.bulb ? "on" : "off") +
                '}';
    }
}
