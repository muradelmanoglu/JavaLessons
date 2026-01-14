package Mentor.L14.LinkedList.Printer;

import java.util.LinkedList;

public class Printer {
    static void main(String[] args) {

        LinkedList<String> works = new LinkedList<>();

        works.add("Salam");
        works.add("Salam1");
        works.add("Salam2");
        works.add("Salam3");

        System.out.println("İşin adı: " + works.removeLast() + " | Priter işi ləğv etdi.");

    }
}
