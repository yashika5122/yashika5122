package SolidDesignPattern.OpenClosePrinciple;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendOTP(String medium) {
        //Logic to integrate with email api
    }

    @Override
    public void sendTransactionReport(String medium) {
        //Logic to integrate with email api
    }
}
