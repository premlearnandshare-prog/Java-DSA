package String_Prem_Prectice;

public class plus_Operater {
    public static void main(String[] args){
         String s = "Ben";
//         s += "Kumar";
//        s += 'a';
        s += 10;


        System.out.println(s);

        System.out.println("raghav" + 10 +20);  // raghav1020
        System.out.println("raghav" + (10 +20));  // raghav30
        System.out.println(10 +20 + "raghav");  // 30raghav
        System.out.println(10 + "raghav" + 20);  // 10raghav20
        System.out.println('A' + 2 + "raghav"); // 67raghav
        // char + int == int

    }
}
