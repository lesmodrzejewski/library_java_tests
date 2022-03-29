import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int getBooksCount() {
        return books.size();
    }

    public void addBookToLibrary(Book book) {
        if (this.getBooksCount() < this.capacity) {
            this.books.add(book);
        }
    }
}
