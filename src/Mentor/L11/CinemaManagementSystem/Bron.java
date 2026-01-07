package Mentor.L11.CinemaManagementSystem;

public class Bron {
    private static int counter = 0;
    private int id;
    private String silentName;
    private double price;

    public Bron (String silentName, double price) {
        this.id = counter++;
        this.silentName = silentName;
        this.price = price;
    }

    public int getId() { return id;}
    public String getSilentName () {return silentName; }
    public void setSilentName (String silentName) {this.silentName = silentName; }
    public double getPrice () {return price; }
    public void setPrice (double price) {this.price = price; }

    @Override
    public String toString () {
        return String.format("ID: %d, Müştərinin adı: %-5s, Biletin Qiyməti: %.2f AZN",
        id, silentName, price);
    }
}

