package Main.L14;

public class Electronics extends Product {


    private  String model;

    public Electronics(Double price, String brand, Integer stock, String model) {
        super(price, brand, stock);
        this.model = model;
    }
}
