package Mentor.L8.AutomobileSystem;

public class Vehicle {

    protected String model;
    protected String color;

    public Vehicle(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Vehicel Uğurla Yaradıldı");
    }

    public void startEngine (){
        System.out.println("Mühərlik işə düşdü");
    }


}
