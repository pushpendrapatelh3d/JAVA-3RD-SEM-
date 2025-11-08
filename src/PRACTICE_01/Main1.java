package PRACTICE_01;

import java.util.Scanner;

public class Main1 {
    public static void main() {
        System.out.println("enter a number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i=1;i<=a;i++)
            System.out.println(i);
    }
}
