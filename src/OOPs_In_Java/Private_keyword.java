package OOPs_In_Java;
class Student {
    String name;
    private int roll_No;
    double cgpa;
     void print(){ //  Access private things
        System.out.println(name+" "+cgpa+" "+roll_No);
    }
    int getRoll_No(){  // Getter
         return roll_No;
    }
    void setRoll_No(int x){  // setter
         roll_No = x;
    }

//    void pr(){
//        print();
//    }
}
public class Private_keyword {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Prem";
        s1.cgpa = 4.9;
//        s1.Roll_No = 45;
        System.out.println(s1.getRoll_No());
        s1.setRoll_No(33);
        System.out.println(s1.getRoll_No());


    }
}
