package OOPs_In_Java;

class student {
    String name;
    int roll_No;
    double cgpa;
}
public class user_defined_data_type {

    public static void main(String[] args){
        student s1 = new student();
        s1.name = "suresh";
        s1.roll_No = 23;
        s1.cgpa = 9.5;

        student s2 = new student();
        s2.name = "pooja";
        s2.roll_No = 33;
        s2.cgpa = 9.3;

        System.out.println(s1.name + " " + s1.roll_No + " " + s1.cgpa);

    }
}
