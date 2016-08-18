package kursW.LibraryBlock;

import kursW.Enums.Positions;
import kursW.UserBlock.User;

import java.util.ArrayList;

/**
 * Created by ddexster on 17.08.16.
 */
public class Artist extends User {
    private final long ID;

    private String name;
    private String secName;
    private int age;
    private Positions position;
    private Band band;
    private ArrayList<Band> bandsPlayed;
    private ArrayList<Concert> concerts;

    public Artist(String name, String secName, int age, Positions position, Band band) {
        this.ID =count++;
        this.name = name;
        this.secName = secName;
        this.age = age;
        this.position = position;
        this.band = band;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Artist setName(String name) {
        this.name = name;
        return this;
    }

    public String getSecName() {
        return secName;
    }

    public Artist setSecName(String secName) {
        this.secName = secName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Artist setAge(int age) {
        this.age = age;
        return this;
    }

    public Positions getPosition() {
        return position;
    }

    public Artist setPosition(Positions position) {
        this.position = position;
        return this;
    }

    public Band getBand() {
        return band;
    }

    public Artist setBand(Band band) {
        this.band = band;
        return this;
    }

    public ArrayList<Band> getBandsPlayed() {
        return bandsPlayed;
    }

    public Artist addBandsPlayed(Band band) {
        this.bandsPlayed.add(band);
        return this;
    }

    public ArrayList<Concert> getConcerts() {
        return band.getConcerts();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(position).append(": ")
                .append(this.getName()).append(" ").append(this.getSecName()).append("\t Age: ").append(this.getAge()).append("\n");
        return sb.toString();
    }
}
