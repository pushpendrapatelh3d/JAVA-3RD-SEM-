package LEC2;

import java.util.Scanner;
import java.lang.String;
import java.lang.System;

public class Main5 {

    public static void main() {
        System.out.println("enter first number :");
        Scanner fs = new Scanner(System.in);
        int a = fs.nextInt();
        System.out.println("enter second number :");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if( a > b )
            System.out.println(a + " is greater than " + b);
        else if( a < b )
            System.out.println( b + " is greater than " + a);
        else
            System.out.println("both " + a + "and" + b + "are equal");


    }
}

