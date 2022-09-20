package SampleProgram.BreakSingleton.UsingClone;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        LazySingleton obj1 = LazySingleton.getInstance();
        System.out.println(obj1.hashCode());

        /*Now to make another instance extend MyClone class in LazySingleton*/
        LazySingleton obj2 = (LazySingleton)obj1.clone();

        /*After overriding clone method in LazySingleton class, it will throw error otherwise it will
        give different hashcode which means new object is created*/
        System.out.println(obj2.hashCode());
    }
}
