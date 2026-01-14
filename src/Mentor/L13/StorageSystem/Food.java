package Mentor.L13.StorageSystem;

public class Food {

    private String name;

    public Food (String name) {
        this.name = name;
    }

    public String toString() {
        System.out.println("Qida yaradıldı.");
        return "Qida: " + name;
    }
}
