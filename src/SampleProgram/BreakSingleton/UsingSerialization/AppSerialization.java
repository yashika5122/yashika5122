package SampleProgram.BreakSingleton.UsingSerialization;

import SampleProgram.BreakSingleton.UsingReflection.LazySingletonReflection;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AppSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LazySingletonSerialization obj1 = LazySingletonSerialization.getInstance();
        System.out.println(obj1.hashCode());

//        Serialize singleton object to file
        ObjectOutput output = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        output.writeObject(obj1);
        output.close();

//      Deserialize singleton object from file
        ObjectInput input = new ObjectInputStream(new FileInputStream("singleton.ser"));
        LazySingletonSerialization lazySingletonSerialization = (LazySingletonSerialization)input.readObject();
        input.close();

        /*So it returning the different hashcode, so to prevent this we can override readResolve() in
        lazySingletonSerialization class, so it will return the same hashcode */
        System.out.println(lazySingletonSerialization.hashCode());

    }
}
