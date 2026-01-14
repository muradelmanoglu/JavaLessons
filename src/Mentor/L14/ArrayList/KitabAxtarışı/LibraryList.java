package Mentor.L14.ArrayList.KitabAxtarışı;

import java.util.ArrayList;

public class LibraryList {
        public static void search(ArrayList<Book> books, String bookName) {
            Book found = null;

            for (Book s : books) {
                if (s.getName().equalsIgnoreCase(bookName)) {
                    found = s;
                    break;
                }
            }
            if (found != null) {
                System.out.println(bookName + " adlı kitab tapıdı.");
            } else {
                System.out.println("Xəta: '" + bookName + "' adlı kitab tapılmadı.");
            }
        }
    }
