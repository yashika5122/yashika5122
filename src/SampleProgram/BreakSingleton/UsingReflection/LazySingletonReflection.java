package SampleProgram.BreakSingleton.UsingReflection;

import SampleProgram.BreakSingleton.UsingClone.MyClone;

public class LazySingletonReflection {
    static LazySingletonReflection singleton = null;

    private LazySingletonReflection(){
        /*To prevent the object creation by reflection*/
        if(singleton!=null){
            throw new IllegalStateException("Object can't be creating using reflection");
        }
    }

    public static LazySingletonReflection getInstance(){
        if(singleton==null){
            return singleton =new LazySingletonReflection();
        }
        return singleton;
    }


}
