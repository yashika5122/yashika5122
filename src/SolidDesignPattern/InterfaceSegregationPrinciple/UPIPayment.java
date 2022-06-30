package SolidDesignPattern.InterfaceSegregationPrinciple;

/* So as Paytm does not required getCashBackAsCreditBalance() we can not force them to implement
 * in order to resolve this we can create another interface and implement it as required*/

public interface UPIPayment {
    public void payMoney();

    public void getScratchCard();

   /* //Not required for all class, removing it from here and creating separate interface for it
    public void getCashBackAsCreditBalance();*/
}
