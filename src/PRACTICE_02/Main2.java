package PRACTICE_02;

import java.util.Scanner;

public class Main2 {
    public static void main(){
        int a;
        System.out.println("enter a number :");
        Scanner src = new Scanner (System.in);
        a = src.nextInt();
        if(a%3==0)
            System.out.println(a+" is multipe of 3");
        else
            System.out.println(a+" is not a multiple of 3");
    }
}
