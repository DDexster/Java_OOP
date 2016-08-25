package hwJavaOOP.hwFilm;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilmIOUtils {
    private static final String CSV_DELIMITER = ";";
    private static final String COMMA_SPACE_DELIMITER = ", ";
    private static final String SPACE_DELIMITER = " ";

//-------------------------Char File Output Methods-------------------------------

    static void outputFilmsIntoFile(List<Film> films, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            outputFilms(films, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void outputFilms(List<Film> films, PrintWriter writer) {
        for (Film film : films) {
            outputFilm(film, writer);
        }
    }

    private static void outputFilm(Film film, PrintWriter writer) {
        writer.println(convertFilmToCsv(film));
    }

    private static String convertFilmToCsv(Film film) {
        return film.getName() + CSV_DELIMITER
                + film.getYear() + CSV_DELIMITER
                + printList(film.getGenre()) + CSV_DELIMITER
                + printList(film.getActors());
    }

    private static String printList(ArrayList list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) sb.append(list.get(i));
            else sb.append(list.get(i)).append(COMMA_SPACE_DELIMITER);
        }
        return sb.toString();
    }

//-------------------------------Char File Input Methods---------------------------------

    static List<Film> readFilmsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return readFilms(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    static void addFilmsFromFile(List<Film> films, String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            addFilms(films, reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Film> readFilms(BufferedReader reader) throws IOException {
        List<Film> films = new ArrayList<>();
        filmParsing(films, reader);
        return films;
    }

    private static void addFilms(List<Film> films, BufferedReader reader) throws IOException {
        filmParsing(films, reader);
    }

    private static void filmParsing(List<Film> films, BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            Film film = parseFilmFromCSV(line);
            if (film != null) films.add(film);
        }
    }

    private static Film parseFilmFromCSV(String line) {
        if (line == null || line.isEmpty()) return null;

        String[] tokens = line.split(CSV_DELIMITER);

        String name = tokens[0];
        int year = Integer.parseInt(tokens[1]);

        Film film = new Film(name, year);

        parseAndAddGenres(tokens[2], film);

        parseAndAddActors(tokens[3], film);

        return film;
    }

    private static void parseAndAddActors(String token, Film film) {
        String[] actors = token.split(COMMA_SPACE_DELIMITER);
        for (String actor : actors) {
            String[] actorTokens = actor.split(SPACE_DELIMITER);
            Actor genuineActor = new Actor(actorTokens[0], actorTokens[1]);
            film.addActors(genuineActor);
        }
    }

    private static void parseAndAddGenres(String token, Film film) {
        String[] genres = token.split(COMMA_SPACE_DELIMITER);
        for (String genre : genres) {
            if (!genre.isEmpty()) film.addGenre(Genre.valueOf(genre));
        }
    }

    //-------------------------------Binary File Output Methods---------------------------------

    static void outputFilmsIntoBinFile(List<Film> films, String filename) {
        try (ObjectOutput outputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filename)))) {
            outputStream.writeObject(films);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //-------------------------------Binary File Input Methods---------------------------------

    static List<Film> inputFilmsFromBinFile(String filename) {
        try (ObjectInput objectInput = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)))) {
            return (List<Film>) objectInput.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
