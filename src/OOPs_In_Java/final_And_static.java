package OOPs_In_Java;

class cricketer{
//    final String country = "India";
    static String country = "India";
    int run;
    String name;
    double avg;
}

public class final_And_static {
    public static void main(String[] args){
         cricketer c1 = new cricketer();
        cricketer c2 = new cricketer();
        c1.country = "England";
        System.out.println(c2.country);
//        System.out.println(c1.country);
//        c1.country = "England"; --> Error
    }
}
