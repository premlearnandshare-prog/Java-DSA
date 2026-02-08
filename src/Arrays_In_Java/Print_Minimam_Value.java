package Arrays_In_Java;

public class Print_Minimam_Value {
    public static void main(String[] args){
        // GeekesforGeekes  largest element in the Array gfg practice platform
        int []arr = {5,75,1,5,2,4,8,5};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println(min);

    }
}
