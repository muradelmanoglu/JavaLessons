package Main.L14;

public class Clothing extends Product {

    private String size;

    public Clothing(Double price, String brand, Integer stock, String size) {
        super(price, brand, stock);
        this.size = size;
    }
}
