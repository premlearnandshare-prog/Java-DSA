package OOPs_In_Java;

public class passing_classes_to_Method {
    // classes are pass by refrance
    public static class car {
        String name;
        int seat;
        double length;
        String type;

        void print(){
            System.out.println(seat + " " + name + " " + length + " " + type);
        }
    }
    public static void main(String[] args){
        car c = new car();
        c.name = "kia";
        c.length = 3.8;
        c.seat = 5;
        c.type = "SUV";
        System.out.println(c.name + " " + c.length + " " + c.seat + " " + c.type);
        change(c);
        System.out.println(c.name + " " + c.length + " " + c.seat + " " + c.type);
        c.print();

    }
    public static void change(car c){
         c.name = "minu";
    }
}
