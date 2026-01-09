package Mentor.L12.BWE;

import java.io.*;

public class BufferedWriterExsample {
    public static void main(String[] args) {

        String path = "/Users/muradelmanoglu/Documents/GitHub/JavaLessons/src/Mentor/L12/BWE";

        File file = new File(path, "payments.log");

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File Created!");
            }
        } catch (IOException e) {
            System.err.println("File yaradılan zaman xəta: " + e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("[PAYMENT_SUCCESS] Order#123");
            bw.newLine();
            bw.write("[PAYMENT_FAILED] Card declined");
            bw.newLine();
            bw.write("[PAYMENT_SUCCESS] Order#124");
            bw.newLine();
            bw.write("[PAYMENT_FAILED] Insufficient funds");

            System.out.println("Mətinlər payments.log falylına uğurla yazıldı.");

        } catch (IOException e) {
            System.err.println("Oxuma Zamanı Xəta! " + e.getMessage());
        }

            try (BufferedReader br = new BufferedReader(new FileReader(file));
                 BufferedWriter bw1 = new BufferedWriter(new FileWriter(path + "/failed_payments.txt"))) {

                String line;
                while ((line = br.readLine()) != null) {
                    if (line.startsWith("[PAYMENT_FAILED]")) {
                        System.out.println("Xəta tapıldı: - " + line);
                        bw1.write(line);
                        bw1.newLine();
                    }
                }
                System.out.println("Uğursuz ödənişlər failed_payments.txt faylına uğurla yazıldı");

            } catch (IOException e) {
                System.err.println("Oxuma, Yazma Zamanı Xəta " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Gözləniləz Xəta" + e.getMessage());
            }
        }
    }
