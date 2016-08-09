package hwJavaOOP.hwTrain;

import java.util.*;

/**
 * Created by ddexster on 08.08.16.
 */
public class Train implements ITrain {
    private ArrayList<Carriage> train = new ArrayList<>();
    private int pos = 0;

    public Train() {
        Random r = new Random();
        for (int i = 0; i < r.nextInt(55); i++) {
            this.train.add(new Carriage(r.nextBoolean()));
        }
    }

    @Override
    public void turnLeft() {
        if (pos > 0) pos--;
        else if (pos == 0) pos = train.size() - 1;
    }

    @Override
    public void turnRight() {
        if (pos < train.size() - 1) pos++;
        else pos = 0;
    }

    @Override
    public void lightOn() {
        train.get(pos).setLightOn();
    }

    @Override
    public void lightOff() {
        train.get(pos).setLightOff();
    }

    @Override
    public boolean isLightOn() {
        return train.get(pos).isLightOn();
    }

    @Override
    public boolean isLength(int expectedLength) {
        return train.size() == expectedLength;
    }
}
