package Mentor.L11.LibraryBookManagementSystem;

public class Books {

    private static int counter = 0;
    private int id;
    private String name;
    private String author;
    private int year;
    private double price;


    public Books(String name, String author, int year, double price) {
        this.id = counter++;
        this.name = name;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public int getId() { return id;}
    public String getName () { return name; }
    public void setName (String name){ this.name = name; }
    public String getAuthor () { return author; }
    public void setAuthor (String author) { this.author = author; }
    public int getYear () {return year; }
    public void setYear (int year) {this.year = year; }
    public double getPrice () {return price; }
    public void setPrice (double price) {this.price = price; }


    @Override
    public String toString() {
        return String.format("ID: %d | Ad: %-15s | Müəllif: %-15s | İl: %d | Qiymət: %.2f AZN",
                id, name, author, year, price);
    }
}
