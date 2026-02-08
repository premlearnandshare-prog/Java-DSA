package Conditions_If_Else;

import java.util.Scanner;

public class persentage_Else_If {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// n-> percentage
        if(n>90 && n<100){
            System.out.println("Excellent ");
        }
        else if (n>80 && n<90){
            System.out.println("Very Good");
        }
        else if (n>70 && n<80){
            System.out.println("Good");
        }
        else if (n>60 && n<70){
            System.out.println("Can do better");
        }
        else if (n>50 && n<60){
            System.out.println("average");
        }
        else if (n>40 && n<50){
            System.out.println("below average");
        }
        else {
            System.out.println("Fail");
        }
    }
}
