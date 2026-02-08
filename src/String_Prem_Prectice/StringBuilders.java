package String_Prem_Prectice;

public class StringBuilders {
    public static void main(String[] args){
         StringBuilder sb = new StringBuilder("Prem");
        System.out.println(sb);
        sb.append("Kumar");
        System.out.println(sb);
        System.out.println(sb.length() + " " + sb.capacity());
       sb.setCharAt(0,'p');
        System.out.println(sb);
        String t = sb.toString();
        System.out.println(t);

    }
}
