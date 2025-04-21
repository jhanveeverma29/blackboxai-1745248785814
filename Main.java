import model.Book;
import service.LibraryService;

public class Main {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        Book book1 = new Book("301", "The Alchemist", "Paulo Coelho");
        Book book2 = new Book("302", "Crime and Punishment", "Fyodor Dostoevsky");
        Book book3 = new Book("303", "The Divine Comedy", "Dante Alighieri");
        Book book4 = new Book("304", "Don Quixote", "Miguel de Cervantes");
        libraryService.addBook(book1);
        libraryService.addBook(book2);
        libraryService.addBook(book3);
        libraryService.addBook(book4);
        libraryService.listAllBooks();
        libraryService.issueBook("302");
        libraryService.issueBook("302");
        libraryService.returnBook("302");
        libraryService.removeBook("301");
        libraryService.issueBook("303");
        libraryService.listAllBooks();
    }
}
