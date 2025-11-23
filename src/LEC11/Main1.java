package LEC11;

import java.util.Scanner;

abstract class shape{
    abstract void area();
}

class circle extends shape{
    double r;
    circle(double a){
        r=a;
    }
    void area(){
        double result ;
        result = 3.14*r*r;
        System.out.println("Area of circle :"+result);
    }
}

class rectangle extends shape{
    double l,b;
    rectangle(double a,double c){
        l=a;
        b=c;
    }
    void area (){
        double result = (double)l*b;
        System.out.println("Area of ractangle :"+result);
    }

}


public class Main1 {

    public static void main(){
        System.out.println("Enter radius :");
        Scanner src = new Scanner(System.in);
        double r = src.nextDouble();
        shape obj = new circle(r);
        obj.area();

        System.out.println("Enter length of ractangle :");
        double a = src.nextDouble();
        System.out.println("Enter breadth of ractangle :");
        double c = src.nextDouble();

        shape obj1 = new rectangle(a,c);
        obj1.area();
    }
}
