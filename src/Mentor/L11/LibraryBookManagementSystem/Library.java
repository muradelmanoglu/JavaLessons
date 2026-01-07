package Mentor.L11.LibraryBookManagementSystem;

import javax.naming.LinkException;

public class Library {
    private Books[][] shelves;
    private int rows, cols;

    public Library (int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.shelves = new Books[rows][cols];
    }

    public void addBooks(int r, int c, Books books) throws LibraryExcaption {
        validateIndices (r,c);
        if (shelves[r][c] != null) {
            throw new LibraryExcaption ("Xeta, Bu yer artiq doludur!");
        }
        shelves[r][c] = books;
        IO.println("Kitab Ugurla elave edildi.");
    }


    public void viewBook() {
        IO.println("Kitabxana Cədvəli");
        for (int i = 0; i< rows; i++){
            for (int j = 0; j < cols; j++){
                String status = (shelves [i][j] != null) ? shelves[i][j].toString() : "[BOŞ]";
                IO.println("[" + i + "] [" + j + "] - " + status );
            }
        }
    }

    public void updateBook (int r, int c, double newPrice) throws LibraryExcaption{
    validateIndices(r, c);
        if (shelves[r][c] == null) {
    throw new LibraryExcaption("Xəta!");
}
        shelves[r][c].setPrice(newPrice);
        IO.println("Məluatlar Yeniləndi!");
    }


    public void delete (int r, int c ) throws LibraryExcaption {
        validateIndices(r, c);
        if (shelves [r][c] == null) {
            throw new LibraryExcaption("Xəta! Bu yer onsuzda boşdur.");
        }
        shelves[r][c] = null;
        System.out.println("Kitab rəfdən silindi.");
    }

    public void findBook (String name) {
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++ ) {
                if (shelves[i][j] != null && shelves[i][j].getName().equalsIgnoreCase(name)) {
                    System.out.println("Kitab Tapıldı. Rəf: [" + i + "] [" + j + "]" + shelves[i][j]);
                    found = true;
                }
            }
        }
        if (!found) System.out.println("Kitab rəfdə yoxdur: " + name);
    }


    private void validateIndices(int r, int c) throws LibraryExcaption {
        if (r < 0 || r >= rows || c < 0 || c >= cols) {
            throw new LibraryExcaption("XƏTA! Kitaxanın ölçüsündən qırağa çıxa bilməzsiniz.");
        }
    }

}
