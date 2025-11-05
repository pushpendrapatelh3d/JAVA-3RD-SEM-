package LEC2;

import java.util.Scanner;
import java.lang.String;
import java.lang.System;

public class Main3 {

    public static void main() {
        System.out.println("ente a number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if( a % 2 ==0)
            System.out.println("EVEN");
        else
            System.out.println("odd");

    }
}

