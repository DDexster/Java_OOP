package kursW.LibraryBlock;

import kursW.Enums.Genre;

/**
 * Created by ddexster on 16.08.16.
 */
public class Song extends Media {
    private String name;
    private Genre genre;
    private double length;
    private long favCount;
    private long playCount;
    private int numInAlbum;

    public Song() {
    }

    public Song(int numInAlbum, String name, Genre genre, double length) {
        this.name = name;
        this.genre = genre;
        this.length = length;
        this.numInAlbum = numInAlbum;
    }

    public String getName() {
        return name;
    }

    public Song setName(String name) {
        this.name = name;
        return this;
    }

    public Genre getGenre() {
        return genre;
    }


    public double getLength() {
        return length;
    }

    public Song setLength(double length) {
        this.length = length;
        return this;
    }

    public long getFavCount() {
        return favCount;
    }

    public long getPlayCount() {
        return playCount;
    }

    public int getNumInAlbum() {
        return numInAlbum;
    }

    public Song setNumInAlbum(int numInAlbum) {
        this.numInAlbum = numInAlbum;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(numInAlbum).append(". ").append(name).append(" - ").append(length).append("\n");
//                .append(" Genre: ").append(genre).append('\n');
        return sb.toString();
    }
}
