package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a user of the library.
 */
public class User {
    private String id;
    private String name;
    private List<Book> issuedBooks;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getIssuedBooks() {
        return issuedBooks;
    }

    public void issueBook(Book book) {
        issuedBooks.add(book);
    }

    public void returnBook(Book book) {
        issuedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", issuedBooks=" + issuedBooks +
                '}';
    }
}
