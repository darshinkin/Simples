package ru.home.hibernate.dao;

import ru.home.hibernate.table.Author;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by dima on 17.02.15.
 */
public interface AuthorDao {
    public void addAuthor(Author author) throws SQLException;
    public void deleteAuthor(Author author) throws SQLException;
    public Author getAuthor(int id) throws SQLException;
    public List<Author> getAuthors() throws SQLException;
}
