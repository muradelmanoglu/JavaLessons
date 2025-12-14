package Mentor.L7.Abstract;

public class Main {
    public static void main(String[] args) {
        Electronic electronic = new Electronic("S25", 1599.99,"Samsung" );
        Book book = new Book("Green Mile", 23.99, "Stephen King");


        electronic.displayInfo();
        electronic.applyDiscount(10);


        book.displayInfo();
        book.applyDiscount(0);
    }



}
