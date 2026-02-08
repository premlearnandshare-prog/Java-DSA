package Arrays_In_Java;

public class Print_Maximum_Value_in_array {
    public static void main(String[] args){
        int []arr = {5,75,1,5,2,4,8,5};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println(max);

    }
}
