package Mentor.L7.Abstract;

public class Book extends Product {

    private String author;

    public Book(String name, double price, String autor) {
        super(name, price);
        this.author = autor;
    }

    @Override
    public void displayInfo() {
        System.out.println("Adı: " + name);
        System.out.println("Qiyməti: " + String.format("%.2f", price) + " Azn");
        System.out.println("Yazar: " + author);
    }

}
