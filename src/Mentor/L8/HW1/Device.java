package Mentor.L8.HW1;

public class Device extends Entity implements Actable {

    protected boolean isOn = false;

public  Device (String name) {
    super(name);
}

@Override
    public void describe() {
    System.out.println("Cihaz: " + name);
}

@Override
    public void interact() {
    if (isOn == true) {
        System.out.println(name + " Açıldı");

    }
    if (isOn == false) {
        System.out.println(name + " Bağlandı.");

    }
}

    @Override
    public void performAction() {
        System.out.println(name + " funksiyasını yerinə yetirir");
        System.out.println();
    }
}

