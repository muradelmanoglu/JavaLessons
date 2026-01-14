package Mentor.L14.ArrayList.KitabAxtarışı;


import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Stephen King", "11.22.63", 12.99));
        books.add(new Book("Marcel Proust", "Albertine Kayıp", 7.60));
        books.add(new Book("Rövşən Abdullaoğlu", "Bu şəhərdə kimsə yoxdur", 11.40));


        System.out.println("Kitablar: ");
        for (Book s : books) {
            System.out.println(s);
        }

        System.out.println("Axtardığınız kitabın adını qeyd edin: ");
        String bookName = sc.nextLine();
        LibraryList.search(books, bookName);

        sc.close();
    }
}

