package String_Prem_Prectice;
public class Reverse_Each_Word {
    public static void main(String[] args){
         String s = "Prem is a good boy";
         StringBuilder sb = new StringBuilder(s);
         // output -> merP si doog yob
        int i = 0, j = 0;
        int n = sb.length();
        while (j < n){
            if (sb.charAt(j) != ' ')   j++;

            else { // sb.charAt(j) == ' '
                // swap i and j-1
                reverse(sb,i,j-1);
                i = j + 1;
                j = i;
            }
        }
        reverse(sb,i,j-1);
        System.out.println(sb);
    }
    public static void reverse(StringBuilder sb,int i , int j){
        while (i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}
