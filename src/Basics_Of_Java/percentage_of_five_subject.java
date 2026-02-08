package Basics_Of_Java;

public class percentage_of_five_subject {
    public static void main(String[] args) {
        //code for calculating percentage
        double x1 = 60;//maths
        double x2 = 55;//chemistry
        double x3 = 53;//physics
        double x4 = 39;//english
        double x5 = 45;//computer science
        double totalobtained = (x1+x2+x3+x4+x5);
        double totalmarks = 4*60;
        double P = (totalobtained/totalmarks)*100;
        System.out.println("Percentage is "+P);



    }
}
