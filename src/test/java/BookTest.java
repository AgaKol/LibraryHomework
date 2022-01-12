import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before() {
        book = new Book("The Lord of the Rings", "J.R.R Tolkien", "fantasy");
    }

    @Test
    public void canGetGenre() {
        assertEquals("fantasy", book.getGenre());
    }

}
