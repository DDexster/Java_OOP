package hwJavaOOP.hwFilm;

import java.util.ArrayList;

public class FilmRunner {
    public static void main(String[] args) {
        ArrayList<Film> films = FilmUtils.constructFilms();

        FilmUtils.printFilms(films);

        ArrayList<Film> findYear = FilmUtils.findByYear(films, 1990, 2000);
        FilmUtils.printFilms(findYear);

        ArrayList<Film> findGenre = FilmUtils.findByGenre(films, Genre.HORROR);
        FilmUtils.printFilms(findGenre);

        ArrayList<Film> findGenre1 = FilmUtils.findByGenre(films, Genre.THRILLER);
        FilmUtils.printFilms(findGenre1);

        ArrayList<Film> sortedByYearStream = FilmUtils.findByYearStream(films, 1990, 2000);
        FilmUtils.printFilms(sortedByYearStream);

        ArrayList<Film> sortedByGenreStream = FilmUtils.findByGenreStream(films, Genre.COMEDY);
        FilmUtils.printFilms(sortedByGenreStream);
    }

}
