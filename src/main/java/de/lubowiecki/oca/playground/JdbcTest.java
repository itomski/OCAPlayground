package de.lubowiecki.oca.playground;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcTest {




    public static void main(String[] args) {

        // DriverManager: Bietet Zugriff auf die Klassen und Methoden des Treibers
        // Connection: Verbindung zur Datenbank
        // Statement: Konkrete Anfrage
        // ResultSet: Ergebnismenge

        new JdbcTest().go();
    }

    private void go() {

        BookRepository repo = new BookRepository();

        // Book book = new Book("Backen ohne Mehl", "Bla bla bla", "1234-5678-77891", "Gesund Pub Inc.", "Bruce Banner");
        // repo.insert(book); // Buch einfügen

        List<Book> books = repo.find(); // Bücher aus der DB abfragen

        for(Book b : books) {
            System.out.println(b.getTitle() + ", " + b.getAuthor());
        }

        Book book = books.get(0); // 0 = Erstes Element in der Liste

        /*
        if(repo.delete(book)) { // Buch löschen
            System.out.println("Buch gelöscht!");
        }
        */

        book.setAuthor("Carol Danvers");
        book.setTitle("Backen ohne Rosinen!");
        // Datensatz ändern
        repo.update(book);

        System.out.println();

        books = repo.find();

        for(Book b : books) {
            System.out.println(b.getTitle() + ", " + b.getAuthor());
        }
    }


}
