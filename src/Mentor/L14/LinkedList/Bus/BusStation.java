package Mentor.L14.LinkedList.Bus;

import java.util.LinkedList;

public class BusStation {
    static void main(String[] args) {

        LinkedList<Person> queue = new LinkedList<>();

        queue.add(new Person("Murad", "Budget"));
        queue.add(new Person("Müşviq", "Budget"));
        queue.add(new Person("Aysun", "Budget"));


        System.out.println("Növbədə olanlar: ");
        for (Person e : queue) {
            System.out.println(e);
        }

        queue.addFirst(new Person("Tural", "VİP"));


        System.out.println("\n============================================================================");
        System.out.println("Növbədə gözləyən " + queue.removeLast() + " olan sərnişin növbədən çıxdı.");
        System.out.println("============================================================================");

        System.out.println("\nYeni növbə:");
        for (Person e : queue) {
            System.out.println(e);
        }
    }
}
