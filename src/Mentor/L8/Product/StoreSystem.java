package Mentor.L8.Product;

public class StoreSystem {
    public static void main(String[] args) {

        System.out.println("         MAĞAZA SİSTEMİ");
        System.out.println("---------------------------------------------");

        ElectronicProduct smartphone = new ElectronicProduct("Smartfon X", 1200.0, 10, "2 il");
        ApparelProduct tShirt = new ApparelProduct("T-shirt", 35.0, 20, "M");
        Product book = new Product("Java Kitabı", 25.0, 15);

        System.out.println("\n--- Məlumatlar ---");
        smartphone.displayInfo();
        tShirt.displayInfo();
        book.displayInfo();

        Order orderProcessor = new Order();

        System.out.println("_______________________________________________________________________________________");

        orderProcessor.createOrder(smartphone, 2);
        System.out.println("Smartfon Yenilənmiş Stok: " + smartphone.getStock());

        orderProcessor.createOrder(tShirt, 25);
        System.out.println("T-shirt Yenilənmiş Stok: " + tShirt.getStock());


        System.out.println("\n--- Endirimli Ümumi Qiymət Hesablamaları ---");

        double electronicPrice = orderProcessor.calculateTotalPrice(smartphone, 1, 0.15);
        System.out.println("1 ədəd Smartfon (15% endirim): " + String.format("%.2f", electronicPrice) + " AZN");


        double apparelPrice = orderProcessor.calculateTotalPrice(tShirt, 3, 0.20);
        System.out.println("3 ədəd T-shirt (20% endirim): " + String.format("%.2f", apparelPrice) + " AZN");



        System.out.println("\n--- Polimorfizm Nümunəsi: Ümumi Product Referansı ---");


        Product polymorphicSmartphone = new ElectronicProduct("Polimorfik Smart cihaz", 1500.0, 5, "3 il");
        polymorphicSmartphone.displayInfo();


        Product polymorphicTShirt = new ApparelProduct("Polimorfik T-shirt", 50.0, 8, "L");
        polymorphicTShirt.displayInfo();


        Product[] products = {smartphone, tShirt, book, polymorphicSmartphone};

        System.out.println("\n--- Product Massivi üzərində Döngü ---");


        for (Product p : products) {
            p.displayInfo();
        }

        System.out.println("=============================================");
    }
}