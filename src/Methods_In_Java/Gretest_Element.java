package Methods_In_Java;

public class Gretest_Element {
    public static void main(String[] arg){

        System.out.println(max(5,7,9));
    }
    public static int max (int a,int b,int c){
        if (a>=b && a>=c){
            //System.out.println(a+" is largest");
            return a;
        }
        else if (b>=a && b>=c){
            //System.out.println(b+" is largest");
            return b;
        }
        else {
            // System.out.println(c+" is largest");
            return c;
        }
    }
}

