package strings;

public class StringBuilder_In_Java {
    public static void main(String[] args){
         String s = new String("Raghav");
         StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        System.out.println(sb.length());

        // Khali StringBuilder kese banaye
        StringBuilder x = new StringBuilder("");
        System.out.println(x.length());

        StringBuilder y = new StringBuilder(10);
        System.out.println(y.capacity());

        // by defalt khali String builder ki capacity 16 hoti h
        StringBuilder z = new StringBuilder();
        System.out.println(z.capacity()); // 16
    }
}
