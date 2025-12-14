package Mentor.L7.Abstract;

public abstract class Product {

String name;
double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void displayInfo();

    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            double discount = percent * (price / 100);
            this.price = price - discount;
            System.out.println(name + " Məhsuluna " + percent + " % endirim tətbiq edildi!");
            System.out.printf("Məhsulun yeni Qiyməti %.2f", price);
        } else
            System.out.println("Endirim Tətbiq Edilmədi! \nMəhsulun Qiyməti: " + price);

        System.out.println("\n");
    }


}
