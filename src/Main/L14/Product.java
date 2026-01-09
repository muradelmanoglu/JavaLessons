package Main.L14;

public abstract class Product {

    private String brand;
    private Double price;
    private Integer stock;
    private Integer countStock;

    public Product(Double price, String brand, Integer stock) {
        this.price = price;
        this.brand = brand;
        this.stock = stock;
    }


    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}
    public Double getPrice() {return price;}
    public void setPrice(Double price) {this.price = price;}
    public Integer getStock() {return stock;}
    public void setStock(Integer stock) {this.stock = stock;}

}
