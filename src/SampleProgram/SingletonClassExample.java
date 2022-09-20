package SampleProgram;

public class SingletonClassExample {

    /*public static SingletonClassExample single_instance;
    public String s;

    //    1. make constructor private
    private SingletonClassExample() {
        s = "Hello this is Singleton class";
    }

    //    2. write static method that has the return type object of this singleton class
    public static SingletonClassExample getInstance() {
        if (single_instance == null)
            single_instance = new SingletonClassExample();

        return single_instance;
    }*/

    public static void main(String[] args)  {
//        Abc o1 = new Abc(); //error coz constructor is private
        Abc o1 = Abc.getInstance();
        Abc o2 = Abc.getInstance(); //even though there is two object, but returning one object obj
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
    }
}

class Abc  {
/*How to make singleton class*/
    //    Step1, create static instance of class, Static classes are sealed and therefore cannot be inherited
    static Abc obj = new Abc();

    //    Step2, create private constructor, it will prevent to create multiple object
    private Abc() {
    }

    //    Step3, create static method with any valid name, that has the return type object of this singleton class
    public static Abc getInstance()  {
        return obj;
    }

    public static void main(String[] args)  {
        Abc a1 = new Abc();
        Abc a2 = new Abc();
        System.out.println(obj.hashCode());
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }
} //singleton
