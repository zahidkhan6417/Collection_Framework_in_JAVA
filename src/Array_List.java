import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        // Create an ArrayList of Book objects
        ArrayList<Book> books = new ArrayList<>();

        // Add books to the ArrayList
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("1984", "George Orwell", 1949));

        // Iterate over the ArrayList and display book information
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (" + year + ")";
    }
}
