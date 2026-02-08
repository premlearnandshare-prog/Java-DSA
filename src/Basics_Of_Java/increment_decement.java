package Basics_Of_Java;

public class increment_decement {
    public static void main(String[] args) {
        int x=5;// int ka matlab hai integer value ok
        System.out.println("The value of x is "+x);
        x = x+1;
        System.out.println("The value of x is "+x);
        x++; // x++ ka matlab hai x=x+1 ok
        System.out.println("The value of x is "+x);
//        x--;//x-- ka matlab hai x =x-1 ok
        System.out.println("The value of x is "+x);
        //This is a comment
        //Computer well not read this
        /*
        System.out.println("The value of x is "+x);
        System.out.println("The value of x is "+x);
        System.out.println("The value of x is "+x);
        */
        x = 5;
        x++;// matlab x = x+1 isme value badhegi baad me print hogi
        System.out.println("The value of x is "+x);
        x--;//matlab x = x-1 isme value kam hogi baad me print hogi
        System.out.println("The value of x is "+x);
        ++x;//matlab x = x+1 per pehle print hoga baad me value badhegi
        System.out.println("The value of x is "+x);
        --x;//matlab x = x-1 per pehle print hoga baad me value kam hogi
        System.out.println("The value of x is "+x);
        x=6;
        System.out.println(x++);//6
        System.out.println(x--);//7
        System.out.println(++x);//7
        System.out.println(--x);//6
        //x++ is "use x and then increment"
        //++x is "increment and then use"

    }
}
