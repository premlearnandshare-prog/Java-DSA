package OOPs_In_Java;
class complexNumber{
    double x;
    double y;
    complexNumber(int x, int y){
        this.x = x;
        this.y = y;
    }
    void print(){
        if (y >= 0) System.out.println(x +" + " +  y + "i");
        else System.out.println(x +" - " +  (-y) + "i");
    }
    void add(complexNumber z){
        this.x += z.x;
        this.y += z.y;
    }

    void mult(complexNumber z){
        // multiplication
        // z1 = x1 + i * y1
        // z2 = x2 + i * y2
        // z1 * z2 = (x1 * x2) + (i * {x1 * y2}) + (i * {x2 * y1}) - (y1 * y2)
        // z1 * z2 = [(x1 * x2) - (y1 * y2)] + i * [(x1 * y2) + (x2 * y1)]
        //                   |                         |
        //            x = real number            y =  imeginary number
        this.x = (x * z.x) - y * z.y;
        this.y = (x * z.y) + (z.x * y);
    }
}
public class complex_Number_class {
    public static void main(String[] args){
         complexNumber z1 = new complexNumber(2,-5);
         z1.print();
        complexNumber z2 = new complexNumber(3,4);
         z2.print();
         z1.add(z2);
         z1.print();

         z2.mult(z1);
         z2.print();
    }
}
