package OOPs_In_Java;

public class constructors {
    public static class car {
        String name;
        int seat;
        double length;
        void print(){
            System.out.println(name + " "+ seat+" "+length);
        }
        car(){ // default constructor

        }
        car(String s,int x, double d){
            name = s;
            seat = x;
            length = d;
        }
    }
    public static void main(String[] args){
         car c1 = new car("Kia sonet", 5,3.99);
         c1.print();

        car c2 = new car("Honda city", 2,4.45);
        c2.print();

        car c3 = new car();
        c3.name = "Lord Alto";
        c3.seat = 4;
        c3.length = 6.55;
        c3.print();

    }
}
