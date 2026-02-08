package Arrays_In_Java;
public class Wava_Array {
    public static void main(String[] args){
     int[]arr = {1,2,3,4,5};
     int n = arr.length;
        for (int i = 1; i < n; i+=2) {
         int temp = arr[i];
         arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
        for(int ele: arr){
        System.out.print(ele + " ");
        }
        System.out.println();
    }
}
