package Mentor.L11.HotelRoomManagmentSystem;

public class Room {

    private static int counter;
    private int id;
    private int roomNumber;
    private int capacity;
    private double priceOneDay;
    private boolean isAvailable = false;


    public Room(int roomNumber, int capacity, double priceOneDay) {
        this.id = counter++;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.priceOneDay = priceOneDay;
        this.isAvailable = true;
    }

    public int getId() { return id; }
    public int getRoomNumber() { return roomNumber; }
    public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }
    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public double getPriceOneDay() { return priceOneDay; }
    public void setPriceOneDay(double priceOneDay) { this.priceOneDay = priceOneDay; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    @Override
    public String toString() {
        return " ID " + id + ": Otaq nömrəsi: " + roomNumber + ". " + capacity + " Nəfərlik otaq. " + " \nQiyməti: " + priceOneDay + " AZN";
    }
}

