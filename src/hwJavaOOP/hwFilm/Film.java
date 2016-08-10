package hwJavaOOP.hwFilm;

import java.util.ArrayList;

public class Film {
    private String name;
    private int year;
    private ArrayList<Actor> actors = new ArrayList<>();
    private ArrayList<Genre> genre = new ArrayList<>();

    public Film() {
    }

    public Film(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Film setName(String name) {
        this.name = name;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Film setYear(int year) {
        this.year = year;
        return this;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public Film setActors(ArrayList<Actor> actors) {
        this.actors = actors;
        return this;
    }

    public Film addActors(Actor actor) {
        this.actors.add(actor);
        return this;
    }

    public Film removeActors(Actor actor) {
        this.actors.remove(actor);
        return this;
    }

    public ArrayList<Genre> getGenre() {
        return genre;
    }

    public Film setGenre(ArrayList<Genre> genre) {
        this.genre = genre;
        return this;
    }

    public Film addGenre(Genre genre) {
        this.genre.add(genre);
        return this;
    }

    public Film removeGenre(Genre genre) {
        this.genre.remove(genre);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Film: ").append(this.name).append("\n");
        sb.append("Year: ").append(this.year).append("\n");
        sb.append("Genre: ");
        for (int i = 0; i < genre.size(); i++) {
            if (i == genre.size() - 1) sb.append(genre.get(i).getGenreName()).append(".\n");
            else sb.append(genre.get(i).getGenreName()).append(", ");
        }
        sb.append("Actors: \n");
        for (int i = 0; i < actors.size(); i++) {
            if (i == actors.size() - 1) sb.append("\t").append(actors.get(i)).append(".\n");
            else sb.append("\t").append(actors.get(i)).append(";\n");
        }
        return sb.toString();
    }
}
