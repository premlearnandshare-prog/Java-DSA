package Arrays_In_Java;

public class Shallow_Copy_Of_Arrays {
    public static void main(String[] args){
//        int a = 4;
//        int b = a;
//        System.out.println(a+" " +b);// 4 4
    // pass by refrence
        int[] arr = {10,20,30,40,50};
        int[] x = arr;// x is a shallow copy of arr
        x[0] = 100;
        System.out.print(arr[0]+" ");

    }
}
