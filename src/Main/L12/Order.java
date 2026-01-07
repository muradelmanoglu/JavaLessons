package Main.L12;

class Order {
    int id;
    byte[] data;

    public Order(int id) {
        this.id = id;
        this.data = new byte[1024 * 1024];
    }
}