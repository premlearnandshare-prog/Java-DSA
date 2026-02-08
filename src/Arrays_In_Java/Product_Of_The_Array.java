package Arrays_In_Java;

public class Product_Of_The_Array {
    public static void main(String[] args){
        int[]arr = {5,3,764,2,5,4,7,87,44,6,4,63,6};
        int Product = 1;
        for (int i = 0; i < arr.length; i++) {
            Product *= arr[i];
        }
        System.out.println(Product);
    }
}
