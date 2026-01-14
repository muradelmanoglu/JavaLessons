package Mentor.L14.LinkedList.IntercityRoute;

import java.util.LinkedList;

public class İntercityRoute {
    static void main(String[] args) {

        LinkedList<String> city = new LinkedList<>();
        city.add("Gəncə");
        city.add("Bakı");
        city.add("Beyləgan");
        city.add("Quba");

        city.add(3, "Biləsuvar");

        city.remove(2);

        System.out.println("Marşurutlar: " + city);
    }
}
