package ru.home.hibernate.dao.impl;

import org.hibernate.Session;
import ru.home.hibernate.dao.BookDao;
import ru.home.hibernate.table.Book;
import ru.home.hibernate.util.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by dima on 15.02.15.
 */
public class BookDaoImpl implements BookDao {
    @Override
    public void addBook(Book book) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(book);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void deleteBook(Book book) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(book);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public Book getBook(int id) throws SQLException {
        Book result = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = (Book) session.get(Book.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return result;
    }

    @Override
    public List<Book> getBooks() throws SQLException {
        List<Book> books = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            books = session.createCriteria(Book.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return books;
    }
}
