package Main.L14;

import java.util.ArrayList;
import java.util.List;

public class Warehouse <T extends Product> {

    private List<T> products = new ArrayList<>();

    public void addProducts (T item) {
        products.add(item);
        System.out.println(item.getBrand() + " məhsulu əlavə edildi.");
    }

    public void deleteProducts (T item) {
        products.remove(item);
        System.out.println(item.getBrand() + " məhsul silindi.");
    }

    public double calculateTotalValue() {
        double total = 0;
        for (T item : products) {
            total = item.getPrice() * item.getStock();
        }
        return total;
    }

    public void showInventory() {
        for (T item : products) {
            System.out.println("Məhsul: " + item.getBrand() + " | Qiymət: " + item.getPrice());
        }
    }
}
