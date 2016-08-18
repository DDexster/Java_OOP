package kursW.Enums;

/**
 * Created by ddexster on 17.08.16.
 */
public enum Positions {
    VOCALS("Vocals"),
    BASS("Bass guitar"),
    GUITAR("Guitar"),
    KEYS("Keyboards"),
    DRUMS("Drums"),
    RHYTHM("Rhythm section"),
    WIND("Winds"),
    ELECTRONICS("Electronics");

    private String posName;

    Positions(String posName) {
        this.posName = posName;
    }

    public String getPosName() {
        return posName;
    }

    @Override
    public String toString() {
        return posName;
    }
}
