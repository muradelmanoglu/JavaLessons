package Main.L14;

public class Main {
    static void main(String[] args) {

        Warehouse<Electronics> electronicsStore = new Warehouse<>();
        Electronics phone = (new Electronics(1200.0, "Samsung", 5, "S23 Ultra"));
        Electronics phone1 = (new Electronics(2500.0, "Apple", 2, "MacBook Pro"));


        electronicsStore.addProducts(phone);
        electronicsStore.addProducts(phone1);

        Warehouse<Clothing> clothingStore = new Warehouse<>();
        clothingStore.addProducts(new Clothing(45.0, "Zara", 20, "L"));


        electronicsStore.deleteProducts(phone1);

        System.out.println("--- Hesabat ---");
        System.out.println("Elektronika anbarının ümumi dəyəri: " + electronicsStore.calculateTotalValue());
        System.out.println("Geyim anbarının ümumi dəyəri: " + clothingStore.calculateTotalValue());
    }
}
