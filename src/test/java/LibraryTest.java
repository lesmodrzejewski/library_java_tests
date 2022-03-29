import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(2);
        book = new Book("Harry Potter", "J.K. Rowling", "Fantasy");
    }

    @Test
    public void hasTitle() {
        assertEquals("Harry Potter", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("J.K. Rowling", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Fantasy", book.getGenre());
    }

    @Test
    public void canCountBooks() {
        library.addBookToLibrary(book);
        assertEquals(1, library.getBooksCount());
    }

    @Test
    public void isLibraryFull() {
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        assertEquals(2, library.getBooksCount());
    }
}
