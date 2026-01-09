package Mentor.L12.Sales;

import java.io.*;

public class Sales {
    static void main(String[] args) {

        String path = "/Users/muradelmanoglu/Documents/GitHub/JavaLessons/src/Mentor/L12/Sales";

        File file = new File(path, "sales.log");

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File yaradıldı.");
            }
        } catch (IOException e) {
            System.err.println("Fayl yaradılması zamanı Xəta" + e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("[SALE_COMPLETED]Product:Laptop");
            bw.newLine();
            bw.write("[SALE_FAILED]Product:Phone");
            bw.newLine();
            bw.write("[SALE_COMPLETED]Product:Tablet");
            bw.newLine();
            bw.write("[SALE_FAILED]Product:Headphones");
            bw.newLine();
            bw.write("[SALE_COMPLETED]Product:Monitor");

            System.out.println("Məlumarlar sales.log faylına uğurla yazlıdı.");
        }catch (IOException e ) {
            System.err.println("Yazılma Zamanı Xəta" + e.getMessage());
        }


        try (BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bwComplated = new BufferedWriter(new FileWriter(path + "/completed_sales.txt"));
        BufferedWriter bwFailed = new BufferedWriter(new FileWriter(path + "/failed_sales.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                if (line.startsWith("[SALE_COMPLETED]")) {
                    System.out.println("Uğurlu Satışlar: " + line);
                    bwComplated.write(line);
                    bwComplated.newLine();
                }
                else if (line.startsWith("[SALE_FAILED]")) {
                    System.out.println("Uğursuz Satışlar: " + line);
                    bwFailed.write(line);
                    bwFailed.newLine();
                }
            }

            System.out.println("Uğurla Satışlar completed_sales.txt faylına yazıldı.");
            System.out.println("Uğursuz Satışlar failed_sales.txt faylına yazıldı.");


        } catch (IOException e){
            System.err.println("Oxuma və ya yazma zamanı xəta!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
