package Mentor.L6.Task2;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("11.22.63", "Stephen Hawking", 850);

        book.getName();

        book.setAuthor("Stephen King");
        book.setPageCount(849);

        book.getPageCount();
        book.getAuthor();

    }
}
