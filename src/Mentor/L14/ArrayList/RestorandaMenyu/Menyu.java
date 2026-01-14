package Mentor.L14.ArrayList.RestorandaMenyu;

import java.util.ArrayList;

public class Menyu {

    private String name;
    private double price;
    private String type;

    public Menyu(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }


    @Override
    public String toString() {
        return "Yeməyin adı: " + getName() + " | Yeməyin növü: " + getType() + " | Qiyməti: " + getPrice() + "Azn";
    }
}



class Restaurant {
    static void main(String[] args) {

        Menyu food = new Menyu("Mərci", 5, "Suplar");
        Menyu food1 = new Menyu("Aş", 9, "Ə yo AŞ deyil!");
        Menyu food2 = new Menyu("Çörəkdə Toyuq Dönəri", 3.5, "Dönər");


        ArrayList <Menyu> menyus = new ArrayList<>();
        menyus.add(food);
        menyus.add(food1);
        menyus.add(food2);


        System.out.println("Menyu");
        for (Menyu s : menyus){
            System.out.println(s);
        }

        menyus.add(new Menyu(" Lavaşda Toyuq Dönəri ", 4, "Dönər."));

        System.out.println("Yenilənmiş Menyu");
        for (Menyu s : menyus){
            System.out.println(s);
        }
    }
}