package hwJavaOOP.hwBooks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class BookUtils {

    private BookUtils() {
    }

    public static List<Book> createBooks() {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book()
                .setBookName("Колесо времени")
                .setAuthorName("Джордан")
                .setPublishing("Киев")
                .setNumPages(10000)
                .setPrice(4000.00)
                .setPubYear(2015)
                .setBindType("hard"));

        bookList.add(new Book()
                .setBookName("Волшебник Земноморья")
                .setAuthorName("Ле Гуин")
                .setPublishing("Москва")
                .setNumPages(769)
                .setPrice(769.90)
                .setPubYear(2003)
                .setBindType("hard"));

        bookList.add(new Book()
                .setBookName("Остров Сокровищ")
                .setAuthorName("Стивенсон")
                .setPublishing("Питер")
                .setNumPages(348)
                .setPrice(150)
                .setPubYear(1986)
                .setBindType("limp"));

        bookList.add(new Book()
                .setBookName("Одиссея Капитана Блада")
                .setAuthorName("Сабатини")
                .setPublishing("Киев")
                .setNumPages(384)
                .setPrice(45)
                .setPubYear(1989)
                .setBindType("limp"));

        return bookList;
    }

    public static List<Book> findByAuthor(List<Book> books, String s) {
        List<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (Objects.equals(b.getAuthorName(), s)) result.add(b);
        }
        return result;
    }

    public static List<Book> findByPub(List<Book> books, String s) {
        List<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (Objects.equals(b.getPublishing(), s)) result.add(b);
        }
        return result;
    }

    public static List<Book> findYearAfter(List<Book> books, int a) {
        List<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (b.getPubYear() > a) result.add(b);
        }
        return result;
    }
}
