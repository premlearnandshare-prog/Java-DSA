package Arrays_In_Java;

public class Array_Of_Other_Datatype {
    public static void main(String[] args){
    double[]arr = new double[7];
    int n = arr.length;
        for (int i = 0; i <n; i++) {
            System.out.println(arr[i]);//0.0
        }
        String[]brr = {"prem","Suresh","Ravi"};
        for (int i = 0; i <n; i++) {
            System.out.println(brr[i]);
        }

    }
}
