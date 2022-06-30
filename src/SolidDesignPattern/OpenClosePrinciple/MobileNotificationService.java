package SolidDesignPattern.OpenClosePrinciple;

public class MobileNotificationService implements NotificationService {
    @Override
    public void sendOTP(String medium) {
        //Logic to integrate with Mobile api
    }

    @Override
    public void sendTransactionReport(String medium) {
        //Logic to integrate with Mobile api
    }
}
