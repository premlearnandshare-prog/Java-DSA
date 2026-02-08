package String_Prem_Prectice;
public class Passing_String_to_Methods {
    public static void main(String[] args) {
         // String --> pass by value
        String s = "Prem";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
    public static void change(String s){
         s = "Madhav";
        System.out.println(s);
    }

}
