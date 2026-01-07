package Main.L7;

public class smsService implements NotificationService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sms göndərildi: " + message);
    }
}
