package String_Prem_Prectice;

public class equals_Function {
    public static void main(String[] args){
         String a = "Raghav";
         String b = "Raghav";
         String c = new String("Raghav");
        System.out.println(a == b);   // true
        System.out.println(a == c);   // false


        // equals Function
        System.out.println(a.equals(b));   //  true
        System.out.println(a.equals(c));   // true


        // == ---> check Address
        // equals --> cheak value

    }
}
