package SolidDesignPattern.DependencyInversionPrinciple;

public class ShoppingMall {
    /* this tightly coupled shopping depends on debit card and if need to change it to credit card then whole
     * code will effect */
    private DebitCard debitCard;

    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPurchase(long amount) {
        debitCard.doTransaction(amount);
    }

    /*Now make it loosely coupled */

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void purchaseSomething(long amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        CreditCard creditCard = new CreditCard();
        /* Now to make it loosely coupled create instance of BankCard*/

        BankCard bankCard = new DebitCard();
//        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.purchaseSomething(5000);

    }
}
