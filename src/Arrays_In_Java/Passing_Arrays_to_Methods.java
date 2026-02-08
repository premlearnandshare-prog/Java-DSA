package Arrays_In_Java;

public class Passing_Arrays_to_Methods {
    public static void main(String[] args){
        int[]x = {10,20,30,40,50};
        System.out.println(x[3]);
        change(x);
        System.out.println(x[3]);
    }
    public static void change(int[]x){
     x[3] = 33;
    }
}
