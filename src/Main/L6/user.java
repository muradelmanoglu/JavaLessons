package Main.L6;

public class user {

    private String name;

    public user(String name) {
        this.name = name;
    }

    public void sendNotification (NotificationService notificationTool, String message) {
        System.out.println(name + " üçün bildiriş hazırlanır!");
        notificationTool.sendMessage(message);
        System.out.println();
    }

}
