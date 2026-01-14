package Mentor.L14.LinkedList.Bus;

public class Person {

    String name;
    String status;

    public Person(String name, String status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return  name + " | Statusu: " + status;
    }
}
