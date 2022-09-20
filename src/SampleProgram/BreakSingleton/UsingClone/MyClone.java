package SampleProgram.BreakSingleton.UsingClone;

public class MyClone implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
