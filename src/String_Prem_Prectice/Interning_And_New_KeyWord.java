package String_Prem_Prectice;

public class Interning_And_New_KeyWord {
    public static void main(String[] args){
         String s = "Raghav";   //  s ------> Raghav
         s = "Madhav";          //  |_______> Madhav
        System.out.println(s);

        String a = "Prem";   //  a --->  Prem <------|
        String b = "Prem";   //  b ------------------|
        System.out.println();
    }
}
