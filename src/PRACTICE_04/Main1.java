package PRACTICE_04;

import java.util.Scanner;

public class Main1 {
    public static void main(){
        int n,a,b;
        Scanner src = new Scanner(System.in);
        System.out.println("Calculator:");
        System.out.println("\nEnter first number:");
        a = src.nextInt();
        System.out.println("\nEnter second number:");
        b = src.nextInt();
        System.out.println("\nEnter 1 for addition");
        System.out.println("\nEnter 2 for subtraction");
        System.out.println("\nEnter 3 for multiplication");
        System.out.println("\nEnter 4 for division");
        System.out.println("\nEnter your choice:");

        n = src.nextInt();
        int result;

        switch(n){
            case 1:
                result = a+b;
                System.out.println("Addition of "+a+"and"+b+":"+result);
                break;
            case 2:
                result = a-b;
                System.out.println("Substraction of "+a+"and"+b+":"+result);
                break;
            case 3:
                result = a*b;
                System.out.println("Substraction of "+a+"and"+b+":"+result);
                break;
            case 4:
                if(b!=0){
                result = a/b;
                System.out.println(" of "+a+"and"+b+":"+result);
                break;}
                else{
                    System.out.println("Can't divide by zero");
                    break;
                }
            default:
                System.out.println("invalid choice");

        }

    }
}
