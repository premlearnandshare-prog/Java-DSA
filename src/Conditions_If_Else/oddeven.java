package Conditions_If_Else;
import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        if(a%2==0) { // a  even hai
            System.out.println("The number is even");
        }
        if (a%2!=0){// a  odd  hai. is if(a%2!=0){} ki jagah else{} bhi likh sakte hai
            System.out.println("The number is odd");
        }
        //not equal !=
        // == ka use comparison ke liye aur = assign(value ko dibbe me store karne ke liye) ke liye



    }
}
