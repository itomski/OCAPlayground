package de.lubowiecki.oca.playground;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    // CRUD
    // Create: insert
    // Read: find, findById, findByTitle
    // Update: update
    // Delete: delete

    // TODO: URL an eine zentralle Stelle auslagern
    private static final String URL = "jdbc:sqlite:test.db";

    private static final String TABLE = "books";

    public BookRepository() {
        createTable();
    }

    private void createTable() {

        try(Connection con = DriverManager.getConnection(URL);
            Statement stmt = con.createStatement()) {

            // executeUpdate führt eine Anweisung aus - Manipuliert die Datenbankstruktur oder Daten
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS " + TABLE + " (" +
                    "id INTEGER PRIMARY KEY, " +
                    "title TEXT NOT NULL, " +
                    "description TEXT, " +
                    "isbn TEXT NOT NULL, " +
                    "publisher TEXT  NOT NULL, " +
                    "author TEXT  NOT NULL)");

        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean insert(Book book) {

        final String SQL = "INSERT INTO " + TABLE + " (id, title, description, isbn, publisher, author) " +
                "VALUES(null, '%s', '%s', '%s', '%s', '%s')";

        final String READY_SQL = String.format(SQL,
                book.getTitle(),
                book.getDescription(),
                book.getIsbn(),
                book.getPublisher(),
                book.getAuthor());

        try(Connection con = DriverManager.getConnection(URL);
            Statement stmt = con.createStatement()) {

            return stmt.executeUpdate(READY_SQL) > 0;

        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean update(Book book) {

        final String SQL = "UPDATE " + TABLE + " SET title = '%s', " +
                                                    "description = '%s', " +
                                                    "isbn = '%s', " +
                                                    "publisher = '%s', " +
                                                    "author = '%s' " +
                                                    "WHERE id = " + book.getId();


        final String READY_SQL = String.format(SQL,
                book.getTitle(),
                book.getDescription(),
                book.getIsbn(),
                book.getPublisher(),
                book.getAuthor());

        try(Connection con = DriverManager.getConnection(URL);
            Statement stmt = con.createStatement()) {

            return stmt.executeUpdate(READY_SQL) > 0;
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private Book populate(ResultSet result) {
        // Befüllt ein Buch-Objekt mit Daten aus der Datenbank
        try {
            Book book = new Book();
            book.setId(result.getInt("id"));
            book.setTitle(result.getString("title"));
            book.setDescription(result.getString("description"));
            book.setIsbn(result.getString("isbn"));
            book.setPublisher(result.getString("publisher"));
            book.setAuthor(result.getString("author"));
            return book;
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Book> find() {
        // DriverManager.getConnection baut eine Verbindung zur Datenbank auf
        // con.createStatement() bereitet eine Anfrage auf die DB vor
        List<Book> books = new ArrayList<>();

        try(Connection con = DriverManager.getConnection(URL);
            Statement stmt = con.createStatement()) {

            // executeQuery führt eine Abfrage aus und liefert die Ergebnismenge zurück
            ResultSet results = stmt.executeQuery("SELECT * FROM " + TABLE);

            // Der Cursor des ResultSets befindet sich am Anfang VOR dem ersten Datensatz
            // next verschiebt den Cursor auf die nächste Position
            while(results.next()) {
                // Book b = populate(results);
                // books.add(b);
                books.add(populate(results));
            }

        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return books;
    }

    public boolean delete(Book book) {
        return delete(book.getId());
    }

    public boolean delete(int id) {

        try(Connection con = DriverManager.getConnection(URL);
            Statement stmt = con.createStatement()) {

           return stmt.executeUpdate("DELETE FROM " + TABLE + " WHERE id = " + id) > 0;
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
