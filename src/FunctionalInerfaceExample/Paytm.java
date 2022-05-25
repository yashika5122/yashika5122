package FunctionalInerfaceExample;

public class Paytm implements UPIPayment{
   @Override
   public String doPayment(String source,String dest){
        UPIPayment.datePatterns("yyyy-M-dd");
        return null;
   }
   @Override
   public double getScratchCard(){
        return UPIPayment.super.getScratchCard();
   }
}