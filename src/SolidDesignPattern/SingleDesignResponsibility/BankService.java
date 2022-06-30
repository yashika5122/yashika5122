package SolidDesignPattern.SingleDesignResponsibility;

/* This BankService contains multiple of task like loan, interest,send OTP which can be further divided into
 * separate class and this is the purpose of SDR to perform single functionality, so we create separate
 * for each */

public class BankService {
    public long deposit(long amount, String accountNo) {
        //deposit amount
        return 0;
    }

    public long withdrawal(long amount, String accountNo) {
        //withdraw amount
        return 0;
    }

    /*Moving this method to PrintService class
    public void printPassBook() {

    }*/

   /* Moving this method to LoanService class
    public void getLoanInterestInfo(String loanType) {
        if (loanType.equalsIgnoreCase("HomeLoan")) {
            //do some job
        }
        if (loanType.equalsIgnoreCase("CarLoan")) {
            //do some job
        }
        if (loanType.equalsIgnoreCase("PersonalLoan")) {
            //do some job
        }
    }*/

    /*Moving this method to NotificationService class
    public void sendOTP(String medium) {
        if (medium.equalsIgnoreCase("email")) {
            //do some job
        }
        if (medium.equalsIgnoreCase("phone")) {
            //do some job
        }
    }*/
}
