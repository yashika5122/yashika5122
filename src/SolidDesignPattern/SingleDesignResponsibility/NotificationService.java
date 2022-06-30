package SolidDesignPattern.SingleDesignResponsibility;

public class NotificationService {
    public void sendOTP(String medium) {
        if (medium.equalsIgnoreCase("email")) {
            //do some job
        }
        if (medium.equalsIgnoreCase("phone")) {
            //do some job
        }
    }
}
