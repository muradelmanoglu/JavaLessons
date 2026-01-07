package Main.L13;

import java.io.*;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ErrorLogger {
    static void main(String[] args) {

        String path = "/Users/muradelmanoglu/Documents/GitHub/JavaLessons/src/Main/L13";

        File file = new File(path, "logs.txt");
        File file1 = new File (path, "critical_errors.txt");

        try {
            if (!file.exists()|| !file1.exists()) {
                file.createNewFile();
                file1.createNewFile();
                System.out.println("File yaradıldı.");
            }
        } catch (IOException e) {
            System.err.println("Xəta" + e.getMessage());
        } catch (Exception e) {
            System.err.println("Gözləniləz Xəta");
        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/muradelmanoglu/Documents/GitHub/JavaLessons/src/Main/L13/logs.txt"))) {
            bw.write("[INFO] Server işə düşdü.");
            bw.newLine();
            bw.write("[ERROR] Verilənlər bazasına qoşulma xətası!");
            bw.newLine();
            bw.write("[INFO] İstifadəçi daxil oldu: Admin.");
            bw.newLine();
            bw.write("[WARNING] Yaddaş dolmaq üzrədir.");
            bw.newLine();
            bw.write("[ERROR] Kritik təhlükəsizlik boşluğu tapıldı.");
            bw.newLine();
            bw.write("[INFO] Sorğu uğurla tamamlandı.");
            System.out.println("Məlumatlar yazıldı.");

        } catch (IOException e) {
            System.err.println("Xəta" + e.getMessage());
        } catch (Exception e) {
            System.err.println("Gözlənilməz Xəta");
        }

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS");

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/muradelmanoglu/Documents/GitHub/JavaLessons/src/Main/L13/logs.txt"));
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("/Users/muradelmanoglu/Documents/GitHub/JavaLessons/src/Main/L13/critical_errors.txt"))) {

            String newTime = now.format(format);
            String line;
            System.out.println("Faylın məzmunu");
            while ((line = br.readLine()) != null) {
                if (line.startsWith("[ERROR]")) {
                    System.out.println("Xəta Tapılıdı: " + line);
                    bw1.write(line + newTime);
                    bw1.newLine();
                }
            }
            System.out.println("Bütün Xətalar yazıldı.");

        } catch (IOException e) {
            System.err.println("Xəta: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Gözləniləz Xəta");
        }
    }
}
