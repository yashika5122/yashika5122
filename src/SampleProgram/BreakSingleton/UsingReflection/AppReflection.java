package SampleProgram.BreakSingleton.UsingReflection;

import SampleProgram.BreakSingleton.UsingClone.LazySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AppReflection {
    public static void main(String[] args) throws CloneNotSupportedException, IllegalAccessException, InvocationTargetException, InstantiationException {
        LazySingletonReflection obj1 = LazySingletonReflection.getInstance();
        System.out.println(obj1.hashCode());

        LazySingletonReflection reflectionInstance = null;

        Constructor[] constructors = LazySingletonReflection.class.getDeclaredConstructors();
        for(Constructor constructor:constructors){
            constructor.setAccessible(true);
            reflectionInstance= (LazySingletonReflection)constructor.newInstance();
        }
        /*It will give the different hashcode value, so to prevent this we will add condition in LazySingletonReflection
        * constructor and it will give error while creating new instance */
        System.out.println(reflectionInstance.hashCode());
    }
}
