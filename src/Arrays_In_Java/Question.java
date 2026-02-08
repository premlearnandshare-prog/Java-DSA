package Arrays_In_Java;

public class Question {
    public static void main(String[] args){
        int[]arr = {10,20,30,40,50,60};
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            if(i%2==0){
                int x = arr[i] + 10;
                System.out.println(x);
            }
            else {// i%2!=0
                int x = 2 * arr[i];
                System.out.println(x);
            }
        }
    }
}
