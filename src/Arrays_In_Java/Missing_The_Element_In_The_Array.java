package Arrays_In_Java;
public class Missing_The_Element_In_The_Array {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,8,9};
        long n = arr.length + 1;
        long sum = (n*(n+1))/2;
        long ArraySum = 0;
        for (int ele: arr){
            ArraySum += ele;
        }
        sum = ArraySum;
        System.out.println((int)(sum));

    }
}
