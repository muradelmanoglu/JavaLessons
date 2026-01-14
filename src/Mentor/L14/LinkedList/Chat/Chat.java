package Mentor.L14.LinkedList.Chat;

import java.util.LinkedList;

public class Chat {
    static void main(String[] args) {

        LinkedList<String> messages = new LinkedList<>();

        messages.add("Salam");
        messages.add("Necəsən?");
        messages.add("Hardasan?");

        System.out.println("Mesajlar: " + messages);

        if (!messages.isEmpty()) {
            String undo = messages.removeLast();
        }

        if (!messages.isEmpty()) {
            System.out.println("Mesajlar: " + messages);
        }
    }
}
