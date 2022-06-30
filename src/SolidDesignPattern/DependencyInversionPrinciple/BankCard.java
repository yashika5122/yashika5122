package SolidDesignPattern.DependencyInversionPrinciple;

/* So to overcome the tightly coupled implementation we can create the separate interface */
public interface BankCard {
    public void doTransaction(long amount);
}
