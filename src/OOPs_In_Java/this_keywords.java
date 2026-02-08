package OOPs_In_Java;

import javax.smartcardio.Card;

public class this_keywords {
    public static class car{
        int price;
        String name;
        car(){}  // Default constructor
        car(int price,String name){
            this.price = price;
            this.name = name;
        }

        void print(){
            System.out.println(name +" " + price);
        }

    }
    public static void main(String[] args){
        car c1 = new car(1250000,"kia sonet");
        c1.print();
    }
}
