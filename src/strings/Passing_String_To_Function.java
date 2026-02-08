package strings;

import java.beans.PropertyEditorManager;

public class Passing_String_To_Function {
    public static void main(String[] args){
         String s  = "Raghav";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
    public static void change(String a){
        a = "madhav";
        System.out.println(a); // pass by value

    }
}
