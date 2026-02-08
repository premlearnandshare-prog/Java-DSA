package strings;

public class substring_In_Java {
    public static void main(String[] args){
         String s = "abcd";
         //.substring(i) --> i to end tak
        //.substring(i,j) --> i to j-1 taj
        System.out.println(s.substring(1)); // Print 1 and aage wale indices
        System.out.println(s.substring(0,3)); // 0 to 3-1
        System.out.println(s.substring(2,2));
//        System.out.println(s.substring(2,1)); --> Error


    }
}
