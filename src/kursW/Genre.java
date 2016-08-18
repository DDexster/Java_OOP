package kursW;

/**
 * Created by ddexster on 16.08.16.
 */
public enum Genre {
    ALTERNATIVE("Alternative"),
    PUNK("Punk"),
    ROCK("Rock"),
    HARD("Hard"),
    INDIE("Indie"),
    BLUES("Blues"),
    CLASSICAL("Classical"),
    COUNTRY("Country"),
    DANCE("Dance"),
    ELECTRONIC("Electronic"),
    POP("Pop"),
    FOLK("Folk"),
    CELTIC("Celtic"),
    HIPHOP("Hip-Hop"),
    RAP("Rap"),
    INDUSTRIAL("Industrial"),
    JAZZ("Jazz"),
    LATIN("Latin"),
    NEWAGE("New Age"),
    OPERA("Opera"),
    RANDB("R&B"),
    REGGAE("Reggae"),
    METAL("Metal"),
    SOUNDTRACK("Soundtrack"),
    VOCAL("Vocal"),
    POLKA("Polka");

    private String genreName;

    Genre(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreName() {
        return genreName;
    }

    @Override
    public String toString() {
        return genreName;
    }
}
