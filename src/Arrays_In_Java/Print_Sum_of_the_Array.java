package Arrays_In_Java;

public class Print_Sum_of_the_Array {
    public static void main(String[] args){
        int[]arr = {8,5,4,78,5,54};
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
