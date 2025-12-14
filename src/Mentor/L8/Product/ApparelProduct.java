package Mentor.L8.Product;

public class ApparelProduct extends Product implements DiscountApplicable {
    private String size;


    public ApparelProduct(String name, double price, int stock, String size) {
        super(name, price, stock);
        this.size = size;
    }


    @Override
    public void displayInfo() {
        System.out.println("Geyim məhsulları: " + getName() + ", Qiyməti: " + String.format("%.2f", getPrice()) +
                " AZN, Stock: " + getStock() + " ədəd, Ölçü: " + size + ".");
    }


    @Override
    public double calculateDiscount(double discountPercentage) {
        double currentPrice = getPrice();
        // Applying an additional 5% bonus discount for apparel
        double totalDiscountPercentage = discountPercentage + 0.05;
        double discountedPrice = currentPrice * (1 - totalDiscountPercentage);
        return discountedPrice;
    }
}
