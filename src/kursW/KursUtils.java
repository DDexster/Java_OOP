package kursW;

import kursW.Enums.Genre;
import kursW.Enums.Positions;
import kursW.LibraryBlock.*;

import java.util.ArrayList;

/**
 * Created by ddexster on 17.08.16.
 */
public class KursUtils {
    static ArrayList<Band> getBandsBase() {
        ArrayList<Band> bands = new ArrayList<>();
        Album badlands = new Album("Badlands", 2013).addSongs(new Song(1, "Castle", Genre.POP, 4.38))
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

        Band halsey = new Band("Halsey").addAlbum(badlands);

        Artist ashleyFrangipane = new Artist("Ashley Nicolette", "Frangipane", 21, Positions.VOCALS, halsey);
        halsey.addArtists(ashleyFrangipane);

        bands.add(halsey);

        Album roadToRuin = new Album("Road To Ruin", 1978)
                .addSongs(new Song(1, "I Just Want to have Something to Do", Genre.PUNK, 2.42))
                .addSongs(new Song(3, "I Wanted Everything", Genre.GARAGE, 3.18))
                .addSongs(new Song(2, "Don't Come Close", Genre.ROCK, 2.44))
                .addSongs(new Song(4, "I Don't Want You", Genre.PUNK, 2.26))
                .addSongs(new Song(5, "Needles And Pins", Genre.GARAGE, 2.21))
                .addSongs(new Song(6, "I'm Against It", Genre.PUNK, 2.07))
                .addSongs(new Song(7, "I Wanna Be Sedated", Genre.GARAGE, 2.29))
                .addSongs(new Song(8, "Go Mental", Genre.GARAGE, 2.42))
                .addSongs(new Song(9, "Questioningly", Genre.PUNK, 3.22))
                .addSongs(new Song(10, "She's The One", Genre.GARAGE, 2.13))
                .addSongs(new Song(11, "Bad Brain", Genre.GARAGE, 2.25))
                .addSongs(new Song(12, "It's a Long Way Back", Genre.PUNK, 2.20));
        Album mondoBizarro = new Album("Mondo Bizarro", 1992)
                .addSongs(new Song(1, "Censorshit", Genre.PUNK, 3.13))
                .addSongs(new Song(2, "The Job That Ate My Brain", Genre.PUNK, 2.17))
                .addSongs(new Song(3, "Poison Heart", Genre.PUNK, 4.04))
                .addSongs(new Song(4, "Anxiety", Genre.PUNK, 2.04))
                .addSongs(new Song(5, "Strength to Endure", Genre.PUNK, 2.59))
                .addSongs(new Song(6, "It's Gonna Be Alright", Genre.PUNK, 3.20))
                .addSongs(new Song(7, "Take It As It Comes", Genre.PUNK, 2.07))
                .addSongs(new Song(8, "Main Man", Genre.PUNK, 3.29))
                .addSongs(new Song(9, "Tomorrow She Goes Away", Genre.PUNK, 2.41))
                .addSongs(new Song(10, "I Won't Let It Happen", Genre.PUNK, 2.22))
                .addSongs(new Song(11, "Cabbies On Crack", Genre.PUNK, 3.01))
                .addSongs(new Song(12, "Heidi Is A Headcase", Genre.PUNK, 2.57))
                .addSongs(new Song(13, "Touring", Genre.PUNK, 2.51))
                .addSongs(new Song(14, "Spider-Man", Genre.PUNK, 1.56));

        Band ramones = new Band("Ramones").addAlbum(roadToRuin).addAlbum(mondoBizarro);

        Artist deedee = new Artist("Dee Dee", "Ramone", 50, Positions.BASS, ramones);
        Artist joeyRamone = new Artist("Joey", "Ramone", 49, Positions.VOCALS, ramones);
        Artist jonnyRamone = new Artist("Jonny", "Ramone", 55, Positions.GUITAR, ramones);
        Artist cjRamone = new Artist("C.J.", "Ramone", 50, Positions.BASS, ramones);
        Artist markyRamone = new Artist("Markey", "Ramone", 64, Positions.DRUMS, ramones);

        ramones.addArtists(deedee).addArtists(joeyRamone).addArtists(jonnyRamone).addArtists(cjRamone).addArtists(markyRamone);

        bands.add(ramones);

        Album wailingWailers = new Album("The Wailing Wailers", 1965)
                .addSongs(new Song(1, "(I'm Gonna) Put It On You", Genre.REGGAE, 3.06))
                .addSongs(new Song(2, "I Need You", Genre.REGGAE, 2.48))
                .addSongs(new Song(3, "Lonesome Feeling", Genre.SKA, 2.50))
                .addSongs(new Song(4, "What's New Pussycat?", Genre.GOSPEL, 3.02))
                .addSongs(new Song(5, "One Love", Genre.SKA, 3.20))
                .addSongs(new Song(6, "When The Well Runs Dry", Genre.REGGAE, 2.35))
                .addSongs(new Song(7, "Ten Commandments Of Love", Genre.REGGAE, 4.16))
                .addSongs(new Song(8, "Rude Boy", Genre.REGGAE, 2.20))
                .addSongs(new Song(9, "It Hurts To Be Alone", Genre.REGGAE, 2.42))
                .addSongs(new Song(10, "Love And Affection", Genre.GOSPEL, 2.42))
                .addSongs(new Song(11, "I'm Still Waiting", Genre.REGGAE, 3.31))
                .addSongs(new Song(12, "Simmer Down", Genre.REGGAE, 2.49));

        Album uprising = new Album("Uprising", 1980)
                .addSongs(new Song(1, "Coming In From the Cold", Genre.REGGAE, 4.30))
                .addSongs(new Song(2, "Real Situation", Genre.REGGAE, 3.08))
                .addSongs(new Song(3, "Bad Card", Genre.REGGAE, 2.50))
                .addSongs(new Song(4, "We And Dem", Genre.REGGAE, 3.12))
                .addSongs(new Song(5, "Work", Genre.REGGAE, 3.41))
                .addSongs(new Song(6, "Zion Train", Genre.REGGAE, 3.36))
                .addSongs(new Song(7, "Pimper's Paradise", Genre.REGGAE, 3.27))
                .addSongs(new Song(8, "Could You Be Loved", Genre.REGGAE, 3.57))
                .addSongs(new Song(9, "Forever Loving Jah", Genre.REGGAE, 3.52))
                .addSongs(new Song(10, "Redemption Song", Genre.REGGAE, 3.47));

        Band bobMarley = new Band("Bob Marley").addAlbum(wailingWailers).addAlbum(uprising);

        Artist bobMar = new Artist("Bob", "Marley", 36, Positions.VOCALS, bobMarley);

        bobMarley.addArtists(bobMar);

        bands.add(bobMarley);

        Album hitsNoize = new Album("Greatest Hits vol.1", 2008)
                .addSongs(new Song(1, "Песня для радио", Genre.HIPHOP, 2.54))
                .addSongs(new Song(2, "За закрытой дверью", Genre.HIPHOP, 3.34))
                .addSongs(new Song(3, "Из окна", Genre.REGGAE, 4.04))
                .addSongs(new Song(4, "Москва - не резиновая", Genre.HIPHOP, 3.07))
                .addSongs(new Song(5, "Кантемировская", Genre.HIPHOP, 3.20))
                .addSongs(new Song(6, "Жизнь без наркотиков", Genre.ROCK, 3.41))
                .addSongs(new Song(7, "На Районе", Genre.HIPHOP, 3.36))
                .addSongs(new Song(8, "На работе", Genre.HIPHOP, 2.29))
                .addSongs(new Song(9, "Кури бамбук!", Genre.RAP, 2.31))
                .addSongs(new Song(10, "Палево!", Genre.HIPHOP, 3.16))
                .addSongs(new Song(11, "Блатняк", Genre.HIPHOP, 3.19))
                .addSongs(new Song(12, "5П", Genre.HIPHOP, 3.05))
                .addSongs(new Song(13, "Девочка-скинхед", Genre.HIPHOP, 3.38))
                .addSongs(new Song(14, "Аренби!!!", Genre.ROCK, 2.45))
                .addSongs(new Song(15, "Поднимите руки", Genre.HIPHOP, 1.23))
                .addSongs(new Song(16, "Мое море", Genre.HIPHOP, 2.25))
                .addSongs(new Song(17, "Выдыхай", Genre.ROCK, 2.33))
                .addSongs(new Song(18, "3П", Genre.HIPHOP, 3.08))
                .addSongs(new Song(19, "Мы всего домились сами", Genre.HIPHOP, 3.03))
                .addVideos(new Video("Песня для радио", Genre.HIPHOP, 2.54))
                .addVideos(new Video("Из окна", Genre.REGGAE, 4.04))
                .addVideos(new Video("Палево!", Genre.HIPHOP, 3.16))
                .addVideos(new Video("Выдыхай", Genre.ROCK, 2.33))
                .addVideos(new Video("За закрытой дверью", Genre.HIPHOP, 3.34));

        Album hardReboot = new Album("Hard Reboot", 2014)
                .addSongs(new Song(1, "Роботы", Genre.HIPHOP, 3.41))
                .addSongs(new Song(2, "Ne2Da?", Genre.HIPHOP, 4.56))
                .addSongs(new Song(3, "Фарыфуры", Genre.HIPHOP, 3.36))
                .addSongs(new Song(4, "Говорящие головы", Genre.REGGAE, 4.23))
                .addSongs(new Song(5, "Хозяин леса", Genre.HARD, 4.31))
                .addSongs(new Song(6, "Сгораю", Genre.ROCK, 3.55))
                .addSongs(new Song(7, "Сохрани мою речь", Genre.HIPHOP, 4.10))
                .addSongs(new Song(8, "Come $ome All", Genre.HIPHOP, 4.01))
                .addSongs(new Song(9, "абв&эюя", Genre.HIPHOP, 4.20))
                .addSongs(new Song(10, "Старые шрамы", Genre.HIPHOP, 3.38))
                .addSongs(new Song(11, "Снайпер", Genre.HIPHOP, 4.29))
                .addSongs(new Song(12, "220", Genre.HIPHOP, 3.39))
                .addSongs(new Song(13, "М", Genre.ROCK, 3.46))
                .addSongs(new Song(14, "Hard Reboot", Genre.HIPHOP, 3.23))
                .addSongs(new Song(15, "Safe Mode", Genre.INSTRUMENTAL, 2.22))
                .addVideos(new Video("Роботы", Genre.HIPHOP, 3.41))
                .addVideos(new Video("Говорящие головы", Genre.REGGAE, 4.23))
                .addVideos(new Video("Come $ome All", Genre.HIPHOP, 4.01))
                .addVideos(new Video("Снайпер", Genre.HIPHOP, 4.29))
                .addVideos(new Video("Ne2Da?", Genre.HIPHOP, 4.56));

        Band noizeMC = new Band("Noize MC").addAlbum(hitsNoize).addAlbum(hardReboot);

        Artist noize = new Artist("Иван", "Алексеев", 31, Positions.VOCALS, noizeMC);
        Artist kramarMax = new Artist("Максим", "Крамар", 31, Positions.KEYS, noizeMC);
        Artist teterinPablo = new Artist("Павел", "Тетерин", 31, Positions.DRUMS, noizeMC);
        Artist kislyAlex = new Artist("Александр", "Кислинский", 31, Positions.BASS, noizeMC);
        Artist amosovStan = new Artist("Станислав", "Аммосов", 31, Positions.ELECTRONICS, noizeMC);

        noizeMC.addArtists(noize).addArtists(kramarMax).addArtists(teterinPablo).addArtists(kislyAlex).addArtists(amosovStan);

        bands.add(noizeMC);
        return bands;
    }
}
