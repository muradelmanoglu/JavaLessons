package Mentor.L14.ArrayList.Futoll;

import java.util.ArrayList;

public class Players {

    private String name;
    private int number;

    public Players(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Oyuncunun adı: " + getName() + "  | Oyuncunun Nömrəsi: " + getNumber();
    }
}


class Komanda {
    static void main(String[] args) {

    Players player = new Players("Murad", 12);
    Players player1 = new Players("Müşvig", 23);
    Players player2 = new Players("Namiq", 13);
    Players player3 = new Players("Fariz", 21);
    Players player4 = new Players("Vahid", 1);

        ArrayList <Players> playersList = new ArrayList<>();
        playersList.add(player);
        playersList.add(player1);
        playersList.add(player2);
        playersList.add(player3);
        playersList.add(player4);


        for (Players s : playersList) {
            System.out.println(s + " Futbolçu komandaya transfer edildi.");
        }

        playersList.remove(player);

        System.out.println("============================================");

        System.out.println("Komandanın yenilənmiş heyəti.");

        for (Players ss : playersList) {
           System.out.println(ss);
       }
    }
}