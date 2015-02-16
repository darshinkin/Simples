package ru.home.hibernate.general;

import ru.home.hibernate.dao.AuthorDao;
import ru.home.hibernate.dao.BookDao;
import ru.home.hibernate.table.Author;
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
        AuthorDao authorDao = factory.getAuthorDao();
        workWithAuthor(authorDao);
        workWithBook(bookDao);
    }

    private static void workWithAuthor(AuthorDao authorDao) throws SQLException {
        Author afthor = new Author();
        afthor.setFirstName("Ivan");
        afthor.setLastName("Ivanov");
        afthor.setMiddleName("Ivanovich");
        authorDao.addAuthor(afthor);
        List<Author> authors = authorDao.getAuthors();
        System.out.println("TABLE AUTHORs");
        System.out.println("id  "+"first name   "+"last name    "+"middle name");
        for (Author author : authors) {
            System.out.println(author.getId()+"     "+author.getFirstName()+"   "+
                    author.getLastName()+"    "+author.getMiddleName());
        }
    }

    private static void workWithBook(BookDao bookDao) throws SQLException {
        Book book = new Book();
        book.setTitle("title 1");
        book.setDescription("description 1");
        book.setIsbn(56546);
        bookDao.addBook(book);
        book = new Book();
        book.setTitle("title 2");
        book.setDescription("description 2");
        book.setIsbn(32434);
        bookDao.addBook(book);
        book = new Book();
        book.setTitle("title 3");
        book.setDescription("description 3");
        book.setIsbn(213545);
        bookDao.addBook(book);
        book = new Book();
        book.setTitle("title 4");
        book.setDescription("description 4");
        book.setIsbn(657654);
        bookDao.addBook(book);

        /*Book book = bobookokDao.getBook(1);
        printBook(book);*/

//        bookDao.deleteBook(bookDao.getBook(1));

        List<Book> books = bookDao.getBooks();

        System.out.println("TABLE BOOKs");
        System.out.println("id  isbn    title   description");

        for (Book b : books) {
            printBook(b);
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
