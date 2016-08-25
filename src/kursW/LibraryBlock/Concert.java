package kursW.LibraryBlock;

import hwJavaOOP.hwFilm.Genre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ddexster on 17.08.16.
 */
public class Concert {
    private Band band;
    private Genre genre;
    private String city;
    private String date;
    private String adress;
    private String info;

    public Concert(Band band, Genre genre, String date, String adress) {
        this.band = band;
        this.genre = genre;
        this.date = date;
        this.adress = adress;
    }

    public Band getBand() {
        return band;
    }

    public Concert setBand(Band band) {
        this.band = band;
        return this;
    }

    public Genre getGenre() {
        return genre;
    }

    public Concert setGenre(Genre genre) {
        this.genre = genre;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Concert setCity(String city) {
        this.city = city;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Concert setDate(String date) {
        this.date = date;
        return this;
    }

    public String getAdress() {
        return adress;
    }

    public Concert setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public String getInfo() {
        return info;
    }

    public Concert setInfo(String info) {
        this.info = info;
        return this;
    }

    private Date toDateFormat(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MMM.yyyy hh:mm");
        try {
            Date date1 = sdf.parse(date);
            return date1;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Concert: \n").append("Band: ").append(band.getName()).append("\n")
                .append("City: ").append(city).append("\tDate: ").append(toDateFormat(date)).append("\n")
                .append("Genre: ").append(genre).append("\tAdress: ").append(adress).append("\n")
                .append("Info: ").append(info);
        return sb.toString();
    }
}
