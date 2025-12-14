package Mentor.L8.Product;

public class Order {

    public void createOrder(Product product, int quantity) {
        if (product.getStock() < quantity) {
            System.err.println("Error: Insufficient stock for " + product.getName() + ". Available: " + product.getStock());
        } else {

            product.setStock(product.getStock() - quantity);
            System.out.println("Sifariş alındı.: " + quantity + " ədəd " + product.getName() + ".");
        }
    }


    public double calculateTotalPrice(DiscountApplicable product, int quantity, double discountPercentage) {


        double discountedUnitPrice = product.calculateDiscount(discountPercentage);

        double totalPrice = discountedUnitPrice * quantity;

        return totalPrice;
    }
}
