package Mentor.L13.StorageSystem;

public class Storage <T> {

    private T item;

    public void store (T item) {
        this.item = item;
    }

    public T retrieve() {
        return item;
    }
}
