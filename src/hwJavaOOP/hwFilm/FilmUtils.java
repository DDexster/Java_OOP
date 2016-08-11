package hwJavaOOP.hwFilm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilmUtils {
    static ArrayList<Film> constructFilms() {
        ArrayList<Film> films = new ArrayList<>();
        Film lockStock = new Film("Lock Stock & Two Smoking Barrels", 1998);
        Film identityThief = new Film("Identity Thief", 2013);
        Film vVendetta = new Film("V is for Vendetta", 2006);
        Film mist = new Film("The Mist", 2007);
        Film dejavu = new Film("Deja Vu", 2006);

        lockStock.addActors(new Actor("Jason", "Statham")).addActors(new Actor("Nick", "Moran"))
                .addActors(new Actor("Jason", "Flemming")).addActors(new Actor("Dexter", "Fletcher"))
                .addGenre(Genre.COMEDY).addGenre(Genre.ACTION);

        identityThief.addActors(new Actor("Jason", "Bateman")).addActors(new Actor("Melissa", "McCarthy"))
                .addActors(new Actor("Amanda", "Pit")).addActors(new Actor("Robert", "Patrick"))
                .addGenre(Genre.COMEDY).addGenre(Genre.ACTION);

        vVendetta.addActors(new Actor("Hugo", "Weaving")).addActors(new Actor("Steven", "Fray"))
                .addActors(new Actor("John", "Gart")).addActors(new Actor("Natalie", "Portman"))
                .addGenre(Genre.THRILLER).addGenre(Genre.DRAMA);

        mist.addActors(new Actor("Thomas", "Jane")).addActors(new Actor("Marisha", "Gey-Harden"))
                .addActors(new Actor("Lori", "Holden")).addActors(new Actor("Nathan", "Gamble"))
                .addGenre(Genre.HORROR).addGenre(Genre.THRILLER);

        dejavu.addActors(new Actor("Denzel", "Washington")).addActors(new Actor("Paula", "Patton"))
                .addActors(new Actor("Val", "Kilmer")).addActors(new Actor("James", "Kasivel"))
                .addGenre(Genre.ACTION).addGenre(Genre.THRILLER).addGenre(Genre.SCIFI);

        films.add(lockStock);
        films.add(identityThief);
        films.add(vVendetta);
        films.add(mist);
        films.add(dejavu);

        return films;
    }

    static void printFilms(ArrayList<Film> films) {
        System.out.println("Movies base:");
        for (Film film : films) {
            System.out.println(film);
        }
    }

    static ArrayList<Film> findByYear(ArrayList<Film> films, int startYear, int stopYear) {
        ArrayList<Film> find = new ArrayList<>();
        System.out.println("Movies released by " + startYear + " - " + stopYear + ":");
        for (Film film : films) {
            if (film.getYear() > startYear && film.getYear() < stopYear) find.add(film);
        }
        return find;
    }

    static ArrayList<Film> findByYear(ArrayList<Film> films, int year) {
        ArrayList<Film> find = new ArrayList<>();
        System.out.println("Movies released by " + year + ":");
        for (Film film : films) {
            if (film.getYear() == year) find.add(film);
        }
        return find;
    }

    static ArrayList<Film> findByGenre(ArrayList<Film> films, Genre genre) {
        ArrayList<Film> find = new ArrayList<>();
        System.out.println("Movies in " + genre.getGenreName() + " genre:");
        for (Film film : films) {
            if (film.getGenre().contains(genre)) find.add(film);
        }
        return find;
    }

    static ArrayList<Film> findByYearStream(ArrayList<Film> films, int startYear, int stopYear) {
        List<Film> sorted = films.stream().filter((f) -> f.getYear() >= startYear && f.getYear() <= stopYear).collect(Collectors.toList());
        return (ArrayList<Film>) sorted;
    }

    static ArrayList<Film> findByGenreStream(ArrayList<Film> films, Genre genre) {
        List<Film> sorted = films.stream().filter((f) -> f.getGenre().contains(genre)).collect(Collectors.toList());
        return (ArrayList<Film>) sorted;
    }
}
