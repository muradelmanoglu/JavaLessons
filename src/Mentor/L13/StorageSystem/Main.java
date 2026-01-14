package Mentor.L13.StorageSystem;

public class Main {
    static void main(String[] args) {

        Storage<Phone> phoneStorage = new Storage<>();
        Storage<Food> foodStorage = new Storage<>();


        phoneStorage.store(new Phone("iPhone 17 Pro Max "));
        foodStorage.store(new Food("Onion"));

        Phone myPhone = phoneStorage.retrieve();
        Food myFood = foodStorage.retrieve();

        System.out.println(myPhone);
        System.out.println(myFood);
    }
}
