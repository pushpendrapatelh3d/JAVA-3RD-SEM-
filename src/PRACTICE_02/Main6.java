package PRACTICE_02;

import java.util.Scanner;

public class Main6 {
    public static void main(){
        System.out.println("enter a number :");
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int isprime = 1;
        for(int i =2;i<=n/2;i++){
            if(n%i==0)
            {
                isprime = 0;
                break;
            }
        }
        if(isprime==1) {
            System.out.println(n + " is a prime number .");
        }
        else
        {
            System.out.println(n+" is not a prime number .");
        }

    }
}
