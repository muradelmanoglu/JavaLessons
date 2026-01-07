package Mentor.L11.HotelRoomManagmentSystem;

public class Hotel {

    private Room[][] rooms;
    private int rows, cols;

    public Hotel (int rows, int cals) {
        this.rows = rows;
        this.cols = cals;
        this.rooms = new Room[rows][cals];
    }

    public void addRoom (int r, int c, Room room) throws HotelCustomException {
        validateIndices(r, c);
        if (rooms[r][c] != null) {
            throw new HotelCustomException("Bu otaq doludur.");
        }
        rooms[r][c] = room;
        System.out.println("Uğurlu Əməliyyat!");
    }

    public void view () {
        System.out.println("Otaq Cədvəli");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String status = (rooms[i][j] != null) ? rooms[i][j].toString() : "[Boşdur]";
                System.out.println("[ "+ i + " ] [ " + j + " ]" + status );
            }
        }
    }

    public void update (int r, int c, double newPrice) throws HotelCustomException {
         validateIndices(r, c);
            if (rooms[r][c] == null) {
              throw new HotelCustomException("Xəta!");
            }
            rooms[r][c].setPriceOneDay(newPrice);
            System.out.println("Uğurlu Əməliyyat!");
    }

    public void delete (int r, int c) throws HotelCustomException {
        validateIndices(r, c);
            if (rooms[r][c] == null) {
                throw new HotelCustomException("Xəta, otaq boşdur.");
            }

            rooms[r][c] = null;
            System.out.println("Otaq boşaldıldı");
    }



    public void findByCapacity (int capacity) {
        boolean found = false;
        System.out.println(capacity + " nəfərlik otaqlar.");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rooms[i][j] != null && rooms[i][j].getCapacity() == capacity){
                    System.out.println("[" + i + "][" + j + "] " + rooms[i][j]);
                    found = true;
                }
            }
        } if (!found) System.out.println("Uyğun otaq tapılmadı.");
    }

    public void findByMaxPrice (double maxPrice) {
        boolean found = false;
        System.out.println("\n--- Qiyməti " + maxPrice + " AZN-dən az olanlar ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rooms[i][j] != null && rooms[i][j].getPriceOneDay() <= maxPrice) {
                    System.out.println("[" + i + "][" + j + "] " + rooms[i][j]);
                    found = true;
                }
            }
        } if (!found) System.out.println("Uyğun otaq tapılmadı.");
    }

    public void findByAvailability(boolean isEmpty) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((isEmpty && rooms[i][j] == null) || (!isEmpty && rooms[i][j] != null)) {
                    System.out.println("[" + i + "][" + j + "] " + (rooms[i][j] != null ? rooms[i][j] : "[Boş]"));
                }
            }
        }
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void validateIndices (int r, int c) throws HotelCustomException {
        if (r < 0 || r >= rows || c < 0 || c >= cols) {
            throw new HotelCustomException("Xəta, Binanın ölçülərinə uyğun deyil.");
        }
    }

}
