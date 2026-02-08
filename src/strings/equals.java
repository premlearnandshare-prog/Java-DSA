package strings;

public class equals {
    public static void main(String[] args){
         String s = "abcxyz";
         String a = "abcxyz";
         String b = new String(s);
         String  c = "abc";
         c = c + "xyz";
        System.out.println(s == a); // true
        System.out.println(s == b); // false
        System.out.println(s ==c); // false


        // == ka kaam hai Address ko compare karna


        // equals ka kaam hai Values ko compare karna
        System.out.println(s.equals(a)); // true
        System.out.println(s.equals(b)); // true
        System.out.println(s.equals(c)); // true

    }
}
