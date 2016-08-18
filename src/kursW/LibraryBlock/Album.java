package kursW.LibraryBlock;

import kursW.Enums.Genre;

import java.util.ArrayList;

/**
 * Created by ddexster on 17.08.16.
 */
public class Album extends Media {
    private String name;
    private Band band;
    private ArrayList<Genre> genres = new ArrayList<>();
    private int year;
    private double length;
    private long favCount;
    private long playCount;
    private ArrayList<Song> songs = new ArrayList<>();
    private ArrayList<Video> videos = new ArrayList<>();

    public Album() {
    }

    public Album(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Album setName(String name) {
        this.name = name;
        return this;
    }

    public Band getBand() {
        return band;
    }

    public Album setBand(Band band) {
        this.band = band;
        return this;
    }

    public double getLength() {
        return Double.parseDouble(getSumLength());
    }

    public ArrayList<Genre> getGenres() {
        generateGenres();
        return genres;
    }

    public long getFavCount() {
        return favCount;
    }

    public long getPlayCount() {
        return playCount;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public int getYear() {
        return year;
    }

    public Album setYear(int year) {
        this.year = year;
        return this;
    }

    public Album addSongs(Song song) {
        this.songs.add(song);
        return this;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public Album addVideos(Video video) {
        this.videos.add(video);
        return this;
    }

    private String getSumLength() {
        double sumLength= 0.0;
        for (Song song : songs) {
            sumLength+=song.getLength();
        }
        String temp= String.format("%.2f",sumLength);
        return temp;
    }

    private String getGenresString() {
        StringBuilder genresStr = new StringBuilder();
        generateGenres();
        for (int i = 0; i < this.genres.size(); i++) {
            if (i==this.genres.size()-1) genresStr.append(this.genres.get(i)).append(".");
            else genresStr.append(this.genres.get(i)).append(", ");
        }
        return genresStr.toString();
    }

    private void generateGenres() {
        for (int i = 0; i < this.songs.size(); i++) {
            if (this.genres.contains(this.songs.get(i).getGenre())) continue;
            else this.genres.add(this.songs.get(i).getGenre());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Album: \"").append(this.name).append("\"\t Year: ").append(this.year).append("\t Length: ").append(getSumLength()).append("\n");
        sb.append("Genres: ").append(getGenresString()).append("\n");
        sb.append("Songs: \n");
        for (Song song : songs) {
            sb.append(song);
        }
        sb.append("\nVideos: ").append("\n");
        for (Video video : videos) {
            sb.append(video);
        }
        return sb.toString();
    }
}
