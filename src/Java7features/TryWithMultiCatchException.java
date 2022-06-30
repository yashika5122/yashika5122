package Java7features;

public class TryWithMultiCatchException {
    public static void main(String[] args) {
//        Before java 7
        try{
            int a = 0;
            int div = 12/a;
            System.out.println(div);

        }catch (NullPointerException e ){}
        catch (ClassCastException ex){}

//        In Java 7
        try{
            int a = 0;
            int div = 12/a;
            System.out.println(div);

        }catch (NullPointerException | ClassCastException e ){}
    }
}
