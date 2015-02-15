package ru.home.hibernate.general;

import ru.home.hibernate.dao.BookDao;
import ru.home.hibernate.table.Book;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by dima on 15.02.15.
 */
public class Project {
    public static void main(String[] args) throws SQLException {
        Factory factory = Factory.getInstance();
        BookDao bookDao = factory.getBookDao();

        /*Book book = new Book();
        book.setTitle("java tutorial");
        book.setDescription("description language java");
        book.setIsbn(56546);

        bookDao.addBook(book);
        */

        /*Book book = bookDao.getBook(1);
        printBook(book);*/

        bookDao.deleteBook(bookDao.getBook(1));

        List<Book> books = bookDao.getBooks();

        System.out.println("id  isbn    title   description");

        for (Book book : books) {
            printBook(book);
        }
    }

    private static void printBook(Book book) {
        int id = book.getId();
        int isbn = book.getIsbn();
        String title = book.getTitle();
        String description = book.getDescription();
        System.out.println(id+"    "+isbn+"    "+title+"   "+description);
    }
}
