package SolidDesignPattern.OpenClosePrinciple;

/*TO add WhatApp Notification we do not need to modify NotificationService(interface) we can
* directly implement and add feature */

public class WhatsAppNotificationService implements NotificationService {
    @Override
    public void sendOTP(String medium) {
        //Logic to integrate with WhatsApp api
    }

    @Override
    public void sendTransactionReport(String medium) {
        //Logic to integrate with WhatsApp api
    }
}
