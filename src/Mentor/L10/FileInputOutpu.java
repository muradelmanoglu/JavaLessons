package Mentor.L10;

import java.io.File;
import java.io.IOException;

class FileInputOutput {

    public static void main(String[] args) {

        String path = "/Users/muradelmanoglu/Desktop/CodePolis/Murad";

        File folder = new File("/Users/muradelmanoglu/Desktop/CodePolis");
        File file = new File(folder, "file.txt");

        try {
            if (!folder.exists()) {
                if (folder.mkdir()) {
                    System.out.println("Folder created");
                }
            } else {
                System.out.println("Folder already exists");
            }

            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }

        } catch (IOException e) {
            System.out.println("Xeta bas verdi: " + e.getMessage());
        }


        File folderIn = new File("Test1");
        File fileIn = new File(folderIn, "file.txt");


        if (!folderIn.exists()) {
            if (folderIn.mkdir()) {
                System.out.println("Folder created");
            }
        } else {
            System.out.println("Folder already exists");
        }

        if (!fileIn.exists()) {
            try {
                fileIn.createNewFile();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }


        File folderOut = new File(path);
        File fileOut = new File(folderOut, "Murad.java");


        if (!folderOut.exists()) {
            if (folderOut.mkdir()) {
                System.out.println("Folder created");
            }
        } else {
            System.out.println("Folder already exists");
        }

        if (!fileOut.exists()) {
            try {
                fileOut.createNewFile();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } else {
            System.out.println("File already exists");
        }
    }
}




