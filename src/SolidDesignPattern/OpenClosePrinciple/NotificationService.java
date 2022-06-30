package SolidDesignPattern.OpenClosePrinciple;

/* Suppose in future we need to add WhatsApp notification or any other notification we can directly
* implement the method, no need to change this interface */

public interface NotificationService {

    public void sendOTP(String medium);

    public  void sendTransactionReport(String medium);
}
