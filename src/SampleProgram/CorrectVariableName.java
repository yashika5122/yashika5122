package SampleProgram;

import java.util.Locale;

/*
* input = modify_variableName
* output = modifyVariableName
* */
public class CorrectVariableName {
    public static void main(String[] args) {
        String s = "modify_variable_name";
        StringBuffer sb = new StringBuffer();
        if(s.contains("_")){
            System.out.println("Java");
            String[] str = s.split("_");
            sb.append(str[0]);
            for(int i = 1; i < str.length;i++){
                sb.append(str[i].substring(0,1).toUpperCase()+str[i].substring(1));
            }
            System.out.println(sb);
        }
        else
        {
            System.out.println("c++");
        }
    }
}
