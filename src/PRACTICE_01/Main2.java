package PRACTICE_01;

import java.util.Scanner;

public class Main2 {
    public static void main(){
        System.out.println("enter a number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int i =1 ;
        while( i <= a ){
            sum = sum + i ;
            i++;
        }

        System.out.println("sum of natural numbers upto " + a + ":" + sum);
    }
}
