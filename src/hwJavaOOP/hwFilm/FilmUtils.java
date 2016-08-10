package hwJavaOOP.hwFilm;

import java.util.ArrayList;

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
        System.out.println("Movies base^");
        for (Film film : films) {
            System.out.println(film);
        }
    }

    static void findByYear(ArrayList<Film> films, int startYear, int stopYear) {
        System.out.println("Movies released by " + startYear + " - " + stopYear + ":");
        for (Film film : films) {
            if (film.getYear() > startYear && film.getYear() < stopYear) System.out.println(film);
        }
    }

    static void findByYear(ArrayList<Film> films, int year) {
        System.out.println("Movies released by " + year + ":");
        for (Film film : films) {
            if (film.getYear() == year) System.out.println(film);
        }
    }

    static void findByGenre(ArrayList<Film> films, Genre genre) {
        System.out.println("Movies in " + genre.getGenreName() + " genre:");
        for (Film film : films) {
            if (film.getGenre().contains(genre)) System.out.println(film);
        }
    }
}
