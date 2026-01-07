package Main.L10;

public class Main extends updatePrice{
    public static void main(String[] args) {

        Product product = new Product(100);
        int deyeri = 50;


        IO.println("Evvel");
        IO.println("Qiymeti " + product.price);
        IO.println("Deyeri " + deyeri);


        updatePrice.updatePrice(product, deyeri);

        IO.println("Sonra");
        IO.println("Qiymeti " + product.price);
        IO.println("Deyeri " + deyeri);

    }
}
