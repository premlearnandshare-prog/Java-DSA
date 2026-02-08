package OOPs_In_Java;

class Complex{
    double a;
    double b;
    void print(){
        System.out.println(a + " + " + b + "i");
    }
    Complex(int a, int b){
        this.a = a;
        this.b = b;
    }
    void divide(Complex z){
        double denominator = ((z.a * z.a) + (z.b * z.b));
       double real = ((this.a * z.a) + (this.b * z.b))/denominator;
        double img = ((this.b * z.a) - (this.a * z.b))/denominator;
        this.a = real;
        this.b = img;
    }
}
public class divide_two_complex_number {
    public static void main(String[] args){
         Complex z1 = new Complex(3,4);
         Complex z2 = new Complex(6,9);
         z1.divide(z2);
         z1.print();
    }
}
