package SolidDesignPattern.SingleDesignResponsibility;

public class LoanService {
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
    }
}
