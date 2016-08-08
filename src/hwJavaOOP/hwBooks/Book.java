package hwJavaOOP.hwBooks;

import java.util.Objects;

public class Book {
    private static int nextID = 0;

    private final int id = nextID++;
    private String bookName;
    private String authorName;
    private String publishing;
    private int numPages;
    private double price;
    private int pubYear;
    private String bindType;

    public Book() {
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public Book setBookName(String bookName) {
        this.bookName = bookName;
        return this;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Book setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    public String getPublishing() {
        return publishing;
    }

    public Book setPublishing(String publishing) {
        this.publishing = publishing;
        return this;
    }

    public int getNumPages() {
        return numPages;
    }

    public Book setNumPages(int numPages) {
        this.numPages = numPages;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Book setPrice(double price) {
        this.price = price;
        return this;
    }

    public int getPubYear() {
        return pubYear;
    }

    public Book setPubYear(int pubYear) {
        this.pubYear = pubYear;
        return this;
    }

    public String getBindType() {
        return bindType;
    }

    public Book setBindType(String bindType) {
        this.bindType = bindType;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getId() == book.getId() &&
                getNumPages() == book.getNumPages() &&
                Double.compare(book.getPrice(), getPrice()) == 0 &&
                getPubYear() == book.getPubYear() &&
                Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(getPublishing(), book.getPublishing()) &&
                Objects.equals(getBindType(), book.getBindType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBookName(), getAuthorName(), getPublishing(), getNumPages(), getPrice(), getPubYear(), getBindType());
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Название книги= '" + bookName + '\'' +
                ", Автор= '" + authorName + '\'' +
                ", Издательство= '" + publishing + '\'' +
                ", Количество страниц= " + numPages +
                ", Цена= " + price + " .грн" +
                ", Год выпуска= " + pubYear +
                ", Переплет= " + bindType +
                '}';
    }
}
