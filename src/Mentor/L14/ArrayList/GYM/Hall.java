package Mentor.L14.ArrayList.GYM;

import java.util.ArrayList;

public class Hall {
    static void main(String[] args) {
        ArrayList <Kq> kilo = new ArrayList<>();
        kilo.add(new Kq(1));
        kilo.add(new Kq(2.5));
        kilo.add(new Kq(5));
        kilo.add(new Kq(7.5));
        kilo.add(new Kq(10));

        System.out.println("Zalda olan daşlar:");
        for (Kq s: kilo) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Çəkisi 5 kilogramdan artıq olan daşların siyahısı: ");
        for (Kq m : kilo ){
            if (m.kq >= 5) {
                System.out.println(m);
            }
        }
    }
}
