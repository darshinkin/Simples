package ru.home.hibernate.dao.impl;

import org.hibernate.Session;
import ru.home.hibernate.dao.AuthorDao;
import ru.home.hibernate.table.Author;
import ru.home.hibernate.util.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by dima on 17.02.15.
 */
public class AuthorDaoImpl implements AuthorDao {
    @Override
    public void addAuthor(Author author) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(author);
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
    public void deleteAuthor(Author author) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(author);
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
    public Author getAuthor(int id) throws SQLException {
        Author result = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = (Author) session.get(Author.class, id);
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
    public List<Author> getAuthors() throws SQLException {
        List<Author> books = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            books = session.createCriteria(Author.class).list();
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
