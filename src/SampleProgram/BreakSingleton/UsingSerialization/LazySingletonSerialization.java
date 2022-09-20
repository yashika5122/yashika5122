package SampleProgram.BreakSingleton.UsingSerialization;

import java.io.Serializable;

public class LazySingletonSerialization implements Serializable {
    static LazySingletonSerialization singleton = null;

    private LazySingletonSerialization(){}



    public static LazySingletonSerialization getInstance(){
        if(singleton==null){
            return singleton =new LazySingletonSerialization();
        }
        return singleton;
    }

/*To prevent the new object creation by serializable we can override the readResolve()
* but not able to get this method*/

}
