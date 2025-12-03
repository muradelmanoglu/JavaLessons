package Main.L5;

public class Giris {

    String Name;
    String Password;

    String setName(String Name) {
        this.Name = Name;
        System.out.println("Hörmətli " + Name + " Xoş gəldiniz!");
        return Name;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }
}