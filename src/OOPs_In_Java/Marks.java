package OOPs_In_Java;

public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int[] marks;
        StudentData(int s){
            marks = new int[s];
        }
    }
    public static void main(String[] args){
         StudentData s1 = new StudentData(4);
         s1.marks[0] = 66;
         s1.marks[1] = 55;
         s1.marks[2] = 87;
         s1.marks[3] = 92;
        StudentData s2 = new StudentData(2);
        StudentData s3 = new StudentData(5);

    }
}
