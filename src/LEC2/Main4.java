package LEC2;


import java.util.Scanner;
import java.lang.String;
import java.lang.System;

public class Main4 {

    public static void main() {
        System.out.println("enter a number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if( a >0 )
            System.out.println("POSITIVE");
        else if( a< 0 )
            System.out.println("NEGATIVE");
        else
            System.out.println("ZERO");


    }
}
