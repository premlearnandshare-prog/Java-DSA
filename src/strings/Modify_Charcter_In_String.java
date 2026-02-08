package strings;

public class Modify_Charcter_In_String {
    public static void main(String[] args){
         String s = "Hello";
         // hello --> heylo
        // 2nd index change to y
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);

    }
}
