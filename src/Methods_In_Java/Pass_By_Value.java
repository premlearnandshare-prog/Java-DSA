package Methods_In_Java;

public class Pass_By_Value {
    public static void main(String[] args){
        int x = 6;
        System.out.println(x);
        change(6);
        System.out.println(x);
    }
    public static void change(int x){
        x =10;
    }
}
