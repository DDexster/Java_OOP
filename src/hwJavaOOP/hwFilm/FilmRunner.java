package hwJavaOOP.hwFilm;

import java.util.ArrayList;

public class FilmRunner {
    public static void main(String[] args) {
        ArrayList<Film> films = FilmUtils.constructFilms();

        FilmUtils.printFilms(films);

        FilmUtils.findByYear(films, 1990, 2000);

        FilmUtils.findByGenre(films, Genre.HORROR);

        FilmUtils.findByGenre(films, Genre.THRILLER);
    }

}
