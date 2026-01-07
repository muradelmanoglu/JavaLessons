package Main.L9;

public class Product {

    protected String name;
    protected int stockCount;

    public Product(String name, int stockCount) {
        this.name = name;
        this.stockCount = stockCount;
    }

    public void sifarisVer(int say) throws OutOfStockException {

        if (say >= 0 ) {
            throw new IllegalArgumentException("Sifariş sayı 0 dan böyük olmalıdır.");
        }

        if (say > stockCount) {
            throw new OutOfStockException("Stokda Kifayət qədər "  + name + " yoxdur" + " Mövcud stok " + stockCount);
        }

        stockCount -= say;
        System.out.println(say + " ədəd " + name + " Sifariş edildi. Yeni Stok " + stockCount);
    }
}
