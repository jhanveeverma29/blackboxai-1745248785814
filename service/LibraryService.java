package service;

import model.Book;

/**
 * Simple library service to manage books using array.
 * Designed for beginners.
 */
public class LibraryService implements ILibraryService {
    private Book[] books;
    private int count;
    private final int MAX_BOOKS = 100;

    // Constructor initializes the book array and count
    public LibraryService() {
        books = new Book[MAX_BOOKS];
        count = 0;
    }

    // Add a book to the library
    public void addBook(Book book) {
        if (count < MAX_BOOKS) {
            books[count] = book;
            count++;
            System.out.println("Book added: " + book.getTitle());
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Remove a book by ID
    public boolean removeBook(String bookId) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId().equals(bookId)) {
                System.out.println("Book removed: " + books[i].getTitle());
                // Shift books to fill the gap
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                return true;
            }
        }
        System.out.println("Book not found with ID: " + bookId);
        return false;
    }

    // Search for a book by ID
    public Book searchBookById(String bookId) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId().equals(bookId)) {
                return books[i];
            }
        }
        return null;
    }

    // Issue a book by ID
    public boolean issueBook(String bookId) {
        Book book = searchBookById(bookId);
        if (book != null && !book.isIssued()) {
            book.setIssued(true);
            System.out.println("Book issued: " + book.getTitle());
            return true;
        }
        System.out.println("Book not available for issue.");
        return false;
    }

    // Return a book by ID
    public boolean returnBook(String bookId) {
        Book book = searchBookById(bookId);
        if (book != null && book.isIssued()) {
            book.setIssued(false);
            System.out.println("Book returned: " + book.getTitle());
            return true;
        }
        System.out.println("Book was not issued.");
        return false;
    }

    // List all books
    public void listAllBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("Books in the library:");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].toString());
        }
    }
}
