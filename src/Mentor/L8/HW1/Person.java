package Mentor.L8.HW1;

public class Person extends Entity implements Actable{

    protected int age;

    public Person (String name, int age) {
       super(name);
       this.age = age;
    }

    @Override
    public void describe() {
        System.out.print("Ad: " + name);
        System.out.print(", ");
        System.out.println("Yaş: " + age);

    }


    @Override
    public void interact() {
        System.out.println(name + " Salamlaşır!");
    }
    
    
    @Override
    public void performAction() {
        System.out.println(name + " Öyrənir!");
        System.out.println();
    }


}
