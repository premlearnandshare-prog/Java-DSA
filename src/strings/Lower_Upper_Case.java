package strings;

public class Lower_Upper_Case {
    public static void main(String[] args){
         String s = "Prem IS A COLLAge STUDEnt";
         String a = s.toLowerCase();
        System.out.println(a);
//        System.out.println(s.toLowerCase());
        String b = s.toUpperCase();
//        System.out.println(s.toUpperCase());
        System.out.println(b);


        // concat
        String str = "abc";
        String st = "def";
//        str.concat(st); // --> it is noting
        System.out.println(str.concat(st));
        System.out.println(str);

        a = str.concat(st);
        System.out.println(a);

    }
}
