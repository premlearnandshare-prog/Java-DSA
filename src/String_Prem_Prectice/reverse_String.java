package String_Prem_Prectice;

public class reverse_String {
    public static void main(String[] args){
         String s = "Raghav";
         StringBuilder sb = new StringBuilder(s);
         sb.reverse();
         s = sb.toString();
        System.out.println(s);
    }
}
