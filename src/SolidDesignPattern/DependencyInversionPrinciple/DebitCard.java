package SolidDesignPattern.DependencyInversionPrinciple;

/* so now instead of individual method creation we can implement from interface*/
public class DebitCard implements BankCard {
    public void doTransaction(long amount) {
        System.out.println("using Debit Card ");
    }
}
