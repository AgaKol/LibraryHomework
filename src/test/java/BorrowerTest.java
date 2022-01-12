import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before() {
        library = new Library(100);
        book = new Book("The Lord of the Rings", "J.R.R Tolkien", "fantasy");
        borrower = new Borrower();
    }

    @Test
    public void canBorrowBook() {
        library.addBook(book);
        borrower.borrowBook(library);
        assertEquals(1, borrower.getCollection());
        assertEquals(0, library.getStock());
    }
}
