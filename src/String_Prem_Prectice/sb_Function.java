package String_Prem_Prectice;

public class sb_Function {
    public static void main(String[] args){
         StringBuilder sb = new StringBuilder("Raghav");
         sb.deleteCharAt(4);
        System.out.println(sb);
        sb.insert(4,'a');
        System.out.println(sb);
        sb.delete(0,4);   // 0 to 3
        System.out.println(sb);
    }
}
