package strings;

public class Insert_And_DeleteCharAt {
    public static void main(String[] args){
         StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        sb.insert(0,'s'); // output --> sabcdef
        System.out.println(sb);
        sb.deleteCharAt(0); // output --> abcdef
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb); // output --> def
        sb. insert(2,'g'); //output --> degf
        System.out.println(sb);
    }
}
