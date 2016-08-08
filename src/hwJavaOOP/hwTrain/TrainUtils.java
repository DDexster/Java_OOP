package hwJavaOOP.hwTrain;

/**
 * Created by ddexster on 08.08.16.
 */
public class TrainUtils {
    static int findLength(Train train) {
        int numOfCarriages = 1;

        while (true) {
            for (int i = 1; i <= numOfCarriages; i++) train.turnRight();

            if (train.isLightOn()) train.lightOff();

            for (int i = 1; i <= numOfCarriages; i++) train.turnLeft();

            if (!train.isLightOn()) break;

            else numOfCarriages++;
        }

        return numOfCarriages;
    }
}
