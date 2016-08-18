package kursW.Filters;

import kursW.Enums.Genre;
import kursW.LibraryBlock.Album;
import kursW.LibraryBlock.Artist;
import kursW.LibraryBlock.Band;
import kursW.LibraryBlock.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ddexster on 18.08.16.
 */
public class FilterUtils {

    public static ArrayList<Band> findByGenre(ArrayList<Band> bands, Genre genre) {
        List<Band> result = bands.stream()
                .filter(band -> band.getGenres().contains(genre))
                .collect(Collectors.toList());
        return (ArrayList<Band>) result;
    }

    public static ArrayList<Band> findByBandName(ArrayList<Band> bands, String name) {
        List<Band> result = bands.stream()
                .filter(band -> band.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
        return (ArrayList<Band>) result;
    }

    public static ArrayList<Band> findByArtistName(ArrayList<Band> bands, String name) {
        List<Band> result = new ArrayList<>();
        for (Band band : bands) {
            for (Artist artist : band.getArtists()) {
                if (artist.getName().equalsIgnoreCase(name)) result.add(band);
            }
        }
        return (ArrayList<Band>) result;
    }

    public static ArrayList<Band> findByAlbum(ArrayList<Band> bands, String album) {
        List<Band> result = new ArrayList<>();
        for (Band band : bands) {
            for (Album album1 : band.getDiscography()) {
                if (album1.getName().equalsIgnoreCase(album)) result.add(band);
            }
        }
        return (ArrayList<Band>) result;
    }

    public static ArrayList<Band> findBySong(ArrayList<Band> bands, String song) {
        List<Band> result = new ArrayList<>();
        for (Band band : bands) {
            for (Album album1 : band.getDiscography()) {
                for (Song song1 : album1.getSongs()) {
                    if (song1.getName().equalsIgnoreCase(song)) result.add(band);
                }
            }
        }
        return (ArrayList<Band>) result;
    }

    public static ArrayList<Band> findByPrivateTask(ArrayList<Band> bands, Genre genre, char firstArtist, int year) {
        List<Band> result = new ArrayList<>();
        for (Band band : bands) {
            for (Artist artist : band.getArtists()) {
                if (artist.getName().toLowerCase().charAt(0)==firstArtist) {
                    for (Album album : band.getDiscography()) {
                        if (band.getGenres().contains(genre)&&album.getYear()==year) result.add(band);
                    }
                }
            }
        }
        return (ArrayList<Band>) result;
    }

}
