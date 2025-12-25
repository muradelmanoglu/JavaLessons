package Main.L6;

public class eMailService extends Mail implements NotificationService {

    @Override
    public void sendMessage(String message) {
        System.out.println("eMail göndərildi: " + message);
    }
}
