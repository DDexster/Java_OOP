package hwJavaOOP.hwBooks;
//Блинов. Глава 3. Вариант А. 5 (**). Book: id, Название, Автор (ы), Издательство, Год издания, Количество стра-ниц, Цена, Тип переплета.
//        Создать массив объектов. Вывести:
//        a)  список книг заданного автора;
//        b)  список книг, выпущенных заданным издательством;
//        c)  список книг, выпущенных после заданного года.
//
//        Подсказки:
//        1. Конструктор по-умолчанию.
//        2. Приватные поля.
//        3. Геттеры/сеттеры для всех полей.
//        4. Код клиента в отдельном классе (BookRunner).
//        5. Можно пользоваться динамическими массивами. List<Book> books = new ArrayList<>();

import java.util.List;

public class BookRunner {
    public static void main(String[] args) {
        List<Book> books = BookUtils.createBooks();
        printList(books);

        List<Book> authBooks = BookUtils.findByAuthor(books, "Джордан");
        printList(authBooks);

        List<Book> pubBooks = BookUtils.findByPub(books, "Киев");
        printList(pubBooks);

        List<Book> yearBooks = BookUtils.findYearAfter(books, 1990);
        printList(yearBooks);


    }

    private static void printList(List<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        System.out.println();
    }

}
