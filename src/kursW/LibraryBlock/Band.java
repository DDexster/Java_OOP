package kursW.LibraryBlock;

import kursW.Genre;
import kursW.UserBlock.Artist;

import java.util.ArrayList;

/**
 * Created by ddexster on 17.08.16.
 */
public class Band {
    private String name;
    private ArrayList<Genre> genres = new ArrayList<>();
    private String bio;
    private ArrayList<Artist> artists = new ArrayList<>();
    private ArrayList<Artist> formerArtists = new ArrayList<>();
    private ArrayList<Album> discography = new ArrayList<>();
    private long favCount;
    private ArrayList<Video> videos = new ArrayList<>();
    private ArrayList<Concert> concerts = new ArrayList<>();

    public Band() {
    }

    public Band(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public Band setName(String name) {
        this.name = name;
        return this;
    }

    public ArrayList<Genre> getGenres() {
        for (Album album : discography) {
            for (Genre genre : album.getGenres()) {
                if (!this.genres.contains(genre)) this.genres.add(genre);
            }
        }
        return genres;
    }

    public Band setGenres(Genre genre) {
        this.genres.add(genre);
        return this;
    }

    public String getBio() {
        return bio;
    }

    public Band setBio(String bio) {
        this.bio = bio;
        return this;
    }

    public ArrayList<Artist> getArtists() {
        return artists;
    }

    public Band addArtists(Artist artists) {
        this.artists.add(artists);
        return this;
    }

    public ArrayList<Artist> getFormerArtists() {
        return formerArtists;
    }

    public Band addFormerArtists(Artist formerArtist) {
        this.formerArtists.add(formerArtist);
        return this;
    }

    public ArrayList<Album> getDiscography() {
        return discography;
    }

    public Band addAlbum(Album discography) {
        this.discography.add(discography);
        return this;
    }

    public long getFavCount() {
        return favCount;
    }

    public ArrayList<Video> getVideos() {
        for (Album album : discography) {
            for (Video video : album.getVideos()) {
                videos.add(video);
            }
        }
        return videos;
    }

    public Band addVideos(Video video) {
        this.videos.add(video);
        return this;
    }

    public ArrayList<Concert> getConcerts() {
        return concerts;
    }

    public Band addConcert(Concert concert) {
        this.concerts.add(concert);
        return this;
    }

    private String genresToString() {
        getGenres();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.genres.size(); i++) {
            if (i==this.genres.size()-1) sb.append(genres.get(i)).append(".");
            else sb.append(genres.get(i)).append(", ");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Band: ").append(this.getName()).append("\tGenres: ").append(genresToString()).append("\n");
        sb.append("Band members: \n");
        for (Artist artist : artists) {
            sb.append(artist).append("\n");
        }
        sb.append("Discography: \n");
        for (Album album : discography) {
            sb.append(album).append("\n");
        }
        sb.trimToSize();
        return sb.toString();
    }
}
