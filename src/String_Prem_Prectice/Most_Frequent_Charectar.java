package String_Prem_Prectice;
public class Most_Frequent_Charectar {
    public static void main(String[] args){

         String s = "Raghav";
         int[]arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            char ch = s.charAt(i);
            int index = (int)(ch) - 97;
            arr[index]++;  // --> arr[index] = arr[index] + 1;
        }
        // max nikalo
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        // max ki value me index wale charecter me badlo
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]){
                char ch = (char)(i + 97);
                System.out.println(ch + " ");
                System.out.println(arr[i] + " ");
            }
        }
    }
}
