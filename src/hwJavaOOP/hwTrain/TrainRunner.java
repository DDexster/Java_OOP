package hwJavaOOP.hwTrain;

/**
 * Created by ddexster on 08.08.16.
 */
public class TrainRunner {
    public static void main(String[] args) {
        Train train = new Train();

        System.out.println("Doll: Hello, you little player!!! How you're doing?\n" +
                "Well I hope not so well, and my game will cheer you up! \n" +
                "So! You are on a train that cycled, and the only way out is to walk out the door in every carriage,\n" +
                "but it clothed on a code locker, the code is a number of carriages on a train!\n" +
                "you can only move between carriages and turn on, or turn off the light.\n" +
                "Good Luck, now kid, you'll gonna need it!!!");

        System.out.println("\n" + "Player: Pffff... Dude.... I have some script for you!\n" +
                "(typing some code). So... let's see.... lights in here are " +
                ((train.isLightOn()) ? "on. So let's do it!" : "off, so let's just switch it on and start!"));

        train.lightOn();

        int code = TrainUtils.findNumOfCarriages(train);

        System.out.println("\n" + "So let's just try it... (typing code)" + (train.isLength(code) ?
                "...prrr... (door opened)... Yahoo! Bite my shiny metal ass, you doll!" : "....prkhpkhpkh... (door closed)... Damn!"));

    }

}
