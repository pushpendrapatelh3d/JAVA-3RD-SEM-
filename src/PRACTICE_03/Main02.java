package PRACTICE_03;

import java.util.Scanner;

public class Main02 {
    static class Circle{
        float radius;

        void area(){
            float a = (float)3.14*radius*radius;
            System.out.println("Area of Circle :"+a);
        }
        void circumference(){
            float a = (float)((float)2*3.14*radius);
            System.out.println("Area of Circle :"+a);
        }
    }
    public static void main(){
        System.out.print("Enter Radius :");
        Scanner src = new Scanner(System.in);
        Circle obj = new Circle();
        obj.radius= src.nextFloat();
        obj.circumference();
        obj.area();


    }
}
