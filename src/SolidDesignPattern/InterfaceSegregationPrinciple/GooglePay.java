package SolidDesignPattern.InterfaceSegregationPrinciple;
/*In Google pay all methods are required*/

public class GooglePay implements UPIPayment,CashBackManager{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }


    @Override
    public void getCashBackAsCreditBalance() {

    }
}
