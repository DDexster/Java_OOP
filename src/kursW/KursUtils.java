package kursW;

import kursW.LibraryBlock.Album;
import kursW.LibraryBlock.Band;
import kursW.LibraryBlock.Song;
import kursW.LibraryBlock.Video;
import kursW.UserBlock.Artist;

import java.util.ArrayList;

/**
 * Created by ddexster on 17.08.16.
 */
public class KursUtils {
    static ArrayList<Band> getBandsBase() {
        ArrayList<Band> bands = new ArrayList<>();
        Album badlands = new Album("Badlands").addSongs(new Song(1, "Castle", Genre.POP, 4.38))
                .addSongs(new Song(2, "Hold ME Down", Genre.INDIE, 3.24))
                .addSongs(new Song(3, "New Americana", Genre.INDIE, 3.03))
                .addSongs(new Song(4, "Drive", Genre.POP, 4.18))
                .addSongs(new Song(5, "Roman Holiday", Genre.POP, 3.22))
                .addSongs(new Song(6, "Colors", Genre.POP, 4.09))
                .addSongs(new Song(7, "Coming Down", Genre.POP, 3.43))
                .addSongs(new Song(8, "Hauting", Genre.POP, 2.32))
                .addSongs(new Song(9, "Control", Genre.INDIE, 3.34))
                .addSongs(new Song(10, "Young God", Genre.POP, 3.00))
                .addSongs(new Song(11, "Chost", Genre.ALTERNATIVE, 2.34))
                .addVideos(new Video("Hold ME Down", Genre.INDIE, 3.24))
                .addVideos(new Video("Colors", Genre.POP, 4.09))
                .addVideos(new Video("Chost", Genre.ALTERNATIVE, 2.34))
                .addVideos(new Video("New Americana", Genre.INDIE, 3.03));


        Band halsey = new Band("Halsey", "Halsey was born and raised in New Jersey as Ashley Frangipane. \n" +
                "She is of Italian, Hungarian, and Irish descent on her mother's side and African-American on " +
                "her father's.[3][4] Growing up, Halsey played the violin, viola, and cello until moving onto " +
                "the acoustic guitar when she was 14.[5] In one of her first interviews, Halsey stated she was " +
                "diagnosed with bipolar disorder around the age of 16 or 17.[6] When she was 18, Halsey " +
                "encountered financial trouble and music became a way to pay her rent. She played numerous " +
                "acoustic shows in different cities under various stage names.[5] She chose \"Halsey\" as " +
                "her moniker because it is an anagram of her real name as well as a street in Brooklyn " +
                "where she spent a lot of time as a teenager.[7] Halsey originally planned on going to " +
                "college to major in fine arts but after realizing she could not afford it instead " +
                "enrolled in a community college as a creative writing major.[8]\n")
                .addAlbum(badlands);

        Artist ashleyFrangipane = new Artist("Ashley Nicolette", "Frangipane", 21, Positions.VOCALS, halsey);
        halsey.addArtists(ashleyFrangipane);

        bands.add(halsey);


        return bands;
    }
}
