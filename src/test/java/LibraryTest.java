import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(2);
        book = new Book("Underwater Photography", "Maria Munn", "photography");
    }

    @Test
    public void canCountNumberOfBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToLibraryStock(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void cantAddBookToLibraryOverCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.countBooks());
    }
}
