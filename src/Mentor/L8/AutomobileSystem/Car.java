package Mentor.L8.AutomobileSystem;

public class Car extends Vehicle implements Fuelable, Movable {


public Car (String model, String color) {
    super(model,color);
    System.out.println(model + " Markalı Avtomobil " + color + " rəngindədir.");
}

@Override
    public void move() {
    System.out.println("\n" + model + " markalı avtomobil Gəncəyə doğru irəliləyir!");
}

@Override
    public void fuel() {
    System.out.println("\n" + model + " markalı avtomobil YDM-ə yanacaq doldurur!");
}

}
