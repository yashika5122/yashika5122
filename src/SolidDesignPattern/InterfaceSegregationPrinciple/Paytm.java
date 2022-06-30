package SolidDesignPattern.InterfaceSegregationPrinciple;
/*But in Paytm getCashBackAsCreditBalance does not required*/

public class Paytm implements UPIPayment{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }
/*
    @Override
    public void getCashBackAsCreditBalance() {
        //not required
    }*/
}
