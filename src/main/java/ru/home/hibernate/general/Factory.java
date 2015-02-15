package ru.home.hibernate.general;

import ru.home.hibernate.dao.BookDao;
import ru.home.hibernate.dao.impl.BookDaoImpl;

/**
 * Created by dima on 16.02.15.
 */
public class Factory {
    private static Factory instance = new Factory();
    private BookDao bookDao;

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
}
