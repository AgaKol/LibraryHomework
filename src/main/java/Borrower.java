import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<>();
    }

    public void borrowBook(Library library) {
        Book book = library.lendBook();
        collection.add(book);
    }

    public int getCollection() {
        return collection.size();
    }
}
