package Mentor.L11.CinemaManagementSystem;

public class CinemaHall {

    private Bron[][] hall;
    private int rows, cols;

    public CinemaHall(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.hall = new Bron[rows][cols];
    }

    public void addBron(int r, int c, Bron bron) throws CustomException {
        validateIndices(r, c);
        if (hall[r][c] != null) {
            throw new CustomException("XƏTA! Bu yer doludur.");
        }
        hall[r][c] = bron;
        System.out.println("Uğurlu Bron Əməliyyatı.");
    }


    public void view() {
        System.out.println("Bron Cədvəli: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            String status = (hall[i][j] != null) ? hall[i][j].toString() : "[BOŞ]";
        IO.println("[ " + i + " ] [ " + j + " ]" + status);
            }
        }
    }

    public void delete(int r, int c) throws CustomException {
        validateIndices(r, c);
        if (hall[r][c] == null) {
            System.out.println("Xəta! Bura onsuzda boşdur.");
        }
        hall[r][c] = null;
        System.out.println("Yer boşaldıldı.");
    }

    public void findByName(String name) {
        boolean found = false;
        for (Bron[] a : hall) {
            for (Bron b : a) {
                if (b != null && b.getSilentName().equalsIgnoreCase(name)) {
                    System.out.println("Bu ada olan bron:" + b);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Bu ada bron olunmayıb!");
        }
    }


    public void validateIndices(int r, int c) throws CustomException {
        if (r < 0 || r >= rows || c < 0 || c >= cols) {
            throw new CustomException("Xəta! Ölçüdən qıra çıxa bilməzsiniz.");
        }
    }
}
