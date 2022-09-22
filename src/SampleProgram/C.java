package SampleProgram;

import java.util.ArrayList;
import java.util.List;

class C
{
    // member of C instances
    private List<String> list = new ArrayList<>();
    C c1 = new C();

    // constructor
    public C ()
    {}

    // How else would you add to the member list if 
    // it wasn't declared outside of methods?
    public void addString (String s)
    {
        list.add (s);
    }

    // return the size of the list
    public int count ()
    {
        // Should I create a new list in here... No, that wouldn't make
        // sense. I should return the size of the member list that 
        // strings may have been added to with the addString method.
        return list.size();
    }

    public static void main(String[] args) {
        C c = new C();
        c.addString("yy");
        System.out.println(c.count());
    }
}