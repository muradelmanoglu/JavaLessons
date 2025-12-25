package Mentor.L8.HW1;

public abstract class Entity implements Describable {

    protected String name;

    public Entity(String name) {
        this.name = name;
    }

    public abstract void interact();

}
