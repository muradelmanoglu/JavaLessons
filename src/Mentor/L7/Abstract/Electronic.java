package Mentor.L7.Abstract;


public class Electronic extends Product {

private String brand;

    public Electronic(String name, double price, String brand) {
        super (name, price);
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Adı: " + name);
        System.out.println("Qiyməti: " + String.format("%.2f", price) + " Azn");
        System.out.println("Brendi: " + brand);
    }

}
