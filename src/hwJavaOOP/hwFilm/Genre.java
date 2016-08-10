package hwJavaOOP.hwFilm;

public enum Genre {
    ACTION("Action"),
    ADVENTURE("Adwenture"),
    WESTERN("Western"),
    DETECTIVE("Detective"),
    DRAMA("Drama"),
    COMEDY("Comedy"),
    FANTASY("Fantasy"),
    SCIFI("Sci-fi"),
    WAR("War"),
    HORROR("Horror"),
    THRILLER("Thriller");

    private final String genreName;

    Genre(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreName() {
        return genreName;
    }
}
