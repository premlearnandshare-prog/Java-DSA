package OOPs_In_Java;
class fraction{
    //fraction --> भिन्न
    int num;   // numerator --> अंश
    int Den; // Denominator --> हर

    fraction(int numerator, int Denominator){
        this.num = numerator;
        this.Den = Denominator;
        simplify();
    }

    void print(){
        System.out.println(num + "/" + Den);
    }

    void add(fraction f){
        this.num = ((this.num *f.Den) + (this.Den * f.num));
        this.Den = (this.Den * f.Den);
        simplify();
    }

    void sub(fraction f){
        this.num = ((this.num *f.Den) - (this.Den * f.num));
        this.Den = (this.Den * f.Den);
        simplify();
    }
    void multiply(fraction f){
        this.num = (this.num * f.num);
        this.Den = (this.Den * f.Den);
        simplify();
    }

    void divide(fraction f){
        this.num = (this.num *f.Den);
        this.Den = (this.Den * f.num);
        simplify();
    }
    void simplify(){
        int gcd = hcf(num,Den);
        num = num / gcd;
        Den = Den / gcd;
    }

    int hcf(int a , int b){
        if (b == 0) return a;
        return hcf(b ,a % b);
    }
}
public class FractionClass {
    public static void main(String[] args){
        fraction f1 = new fraction(3,7);
        f1.print();
        fraction f2 = new fraction(7,3);
        f1.print();
        f1.add(f2);
        f1.print();
        fraction f3= new fraction(50,100);
        f3.print();
    }
}
