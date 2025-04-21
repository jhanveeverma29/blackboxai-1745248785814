package service;

import model.Book;

/**
 * Interface for library service operations.
 * Simple version for beginners.
 */
public interface ILibraryService {
    void addBook(Book book);
    boolean removeBook(String bookId);
    Book searchBookById(String bookId);
    boolean issueBook(String bookId);
    boolean returnBook(String bookId);
    void listAllBooks();
}
