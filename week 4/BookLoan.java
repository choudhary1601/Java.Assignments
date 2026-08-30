class Book {
    private String title;
    private String author;
    private String bookCode;
    private boolean loaned;

    Book(String title, String author, String bookCode) {
        if (title.trim().isEmpty() || author.trim().isEmpty()
                || bookCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Text cannot be blank");
        }

        this.title = title;
        this.author = author;
        this.bookCode = bookCode;
        loaned = false;
    }

    boolean borrowBook() {
        if (loaned) {
            return false;
        }

        loaned = true;
        return true;
    }

    boolean returnBook() {
        if (!loaned) {
            return false;
        }

        loaned = false;
        return true;
    }

    boolean isAvailable() {
        return !loaned;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    String getBookCode() {
        return bookCode;
    }

    public String toString() {
        return title + " by " + author + " (" + bookCode + ")";
    }
}

public class BookLoan {
    public static void main(String[] args) {

        Book book1 = new Book("Java Basics", "John", "B101");
        Book book2 = new Book("Python Basics", "Alex", "B102");

        System.out.println(book1.borrowBook());
        System.out.println(book1.borrowBook());

        System.out.println(book1.returnBook());
        System.out.println(book1.returnBook());

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(book1.isAvailable());
        System.out.println(book2.isAvailable());
    }
}
