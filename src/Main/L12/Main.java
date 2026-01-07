package Main.L12;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        int count = 0;
        Runtime runtime = Runtime.getRuntime();


        while (true) {
            new Order(count++);

            if (count % 100 == 0) {
                long total = runtime.totalMemory() / (1024 * 1024);
                long free = runtime.freeMemory() / (1024 * 1024);
                long used = total - free;

                System.out.println("Sifariş: " + count +
                        " | Ümumi: " + total + "MB" +
                        " | Dolu: " + used + "MB" +
                        " | Boş: " + free + "MB");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
