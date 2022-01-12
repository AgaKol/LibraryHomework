import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Library {
    private int capacity;
    private ArrayList<Book> stock;

    public Library (int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public int getStock() {
        return stock.size();
    }

    public void addBook(Book book) {
        if(stock.size() < capacity)
            stock.add(book);
    }

    public Book lendBook() {
        return this.stock.remove(0);
    }

    public HashMap<String, Integer> getBooksByGenre(String genre) {
        HashMap <String, Integer> booksByGenre = new HashMap<>();
        int total = 0;
        for (Book book : stock) {
            if (Objects.equals(genre, book.getGenre())) {
                booksByGenre.put(book.getGenre(), total+1);
            }
        }
        return booksByGenre;
    }
}
