package Mentor.L13.StorageSystem;

public class Phone {
    private String model;

    public Phone(String model) {
        this.model = model;
    }

    public String toString() {
        System.out.println("Telefon modeli yaradıldı.");
        return "Telefon modeli: " + model;
    }
}
