package ru.home.hibernate.general;

import ru.home.hibernate.dao.AuthorDao;
import ru.home.hibernate.dao.BookDao;
import ru.home.hibernate.dao.impl.AuthorDaoImpl;
import ru.home.hibernate.dao.impl.BookDaoImpl;

/**
 * Created by dima on 16.02.15.
 */
public class Factory {
    private static Factory instance = new Factory();
    private BookDao bookDao;
    private AuthorDao authorDao;

    private Factory(){}

    public static Factory getInstance() {
        return Factory.instance;
    }

    public BookDao getBookDao() {
        if (bookDao == null) {
            bookDao = new BookDaoImpl();
        }
        return bookDao;
    }

    public AuthorDao getAuthorDao() {
        if (authorDao == null) {
            authorDao = new AuthorDaoImpl();
        }
        return authorDao;
    }
}
