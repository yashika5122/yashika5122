package SampleProgram.BreakSingleton.UsingClone;

import java.io.Serializable;

public class LazySingleton extends MyClone implements Serializable {
    private LazySingleton(){}

    static LazySingleton singleton = null;

    public static LazySingleton getInstance(){
        if(singleton==null){
            return singleton =new LazySingleton();
        }
        return singleton;
    }

    /*To Prevent it from breaking singleton law, we override the clone method, so next time if we
    try to create clone it will throw error*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
         throw new CloneNotSupportedException();
    }
}
