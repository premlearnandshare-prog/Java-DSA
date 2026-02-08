package strings;

public class Index_Of {
    public static void main(String[] args){
         String s = "prem Kumar";
        System.out.println(s.indexOf('r')); // output 1
        System.out.println(s.indexOf('z')); // output -1
        System.out.println(s.lastIndexOf('r'));// output 9

        String a = "abcdddd";
        String b = "dbc";
        System.out.println(a.compareTo(b)); // output -3
//        why
        //   a b c
        //   d b c   // a and d ki askai value 97 and 100 hoti h
        //   function a.compareTo(b) hai matlab a-b  == 97 - 100 = -3



    }
}
