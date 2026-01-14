package Mentor.L14.ArrayList.KitabAxtarışı;

public class Book {

    private String autor;
    private  String name;
    private  double price;

    public Book(String autor, String name, double price) {
        this.autor = autor;
        this.name = name;
        this.price = price;
    }

    public String getAutor() {return autor;}
    public String getName() {return name;}
    public double getPrice() {return price;}

    @Override
    public String toString() {
        return "Kitabın Yazarı: " + autor + " | Kitabın adı: " + name + " | Qiyməti: " + price;
    }
}

