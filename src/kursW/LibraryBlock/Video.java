package kursW.LibraryBlock;


import kursW.Enums.Genre;

/**
 * Created by ddexster on 16.08.16.
 */
public class Video extends Media {
    private String name;
    private Genre genre;
    private double length;
    private long favCount;
    private long playCount;

    public Video() {
    }

    public Video(String name, Genre genre, double length) {
        this.name = name;
        this.genre = genre;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public Video setName(String name) {
        this.name = name;
        return this;
    }

    public Genre getGenre() {
        return genre;
    }

    public Video setGenre(Genre genre) {
        this.genre = genre;
        return this;
    }

    public double getLength() {
        return length;
    }

    public Video setLength(double length) {
        this.length = length;
        return this;
    }

    public long getFavCount() {
        return favCount;
    }

    public long getPlayCount() {
        return playCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" - ").append(length).append("\n");
//                .append(" Genre: ").append(genre).append("\n");
        return sb.toString();
    }
}
