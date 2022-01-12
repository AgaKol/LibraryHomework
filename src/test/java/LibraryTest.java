import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;
    private Book book2;

    @Before
    public void before() {
        library = new Library(100);
        book = new Book("The Lord of the Rings", "J.R.R Tolkien", "fantasy");
        book2 = new Book("The Lord of the Rings", "J.R.R Tolkien", "fantasy");
    }

    @Test
    public void canGetStock() {
        assertEquals(0, library.getStock());
    }

    @Test
    public void canAddBooksToStock() {
        library.addBook(book);
        assertEquals(1, library.getStock());
    }

    @Test
    public void cannotAddToStockOverCapacity() {
        library = new Library(0);
        library.addBook(book);
        assertEquals(0, library.getStock());
    }

    @Test
    public void canLendBook() {
        library.addBook(book);
        library.lendBook();
        assertEquals(0, library.getStock());
    }

    @Test
    public void canCountByGenre() {
        library.addBook(book);
        Integer genre = library.getBooksByGenre("fantasy").get("fantasy");
        assertEquals(java.util.Optional.of(1), java.util.Optional.of(genre));

    }
}
