package PRACTICE_04;


import java.util.Scanner;

public class Main2 {
    public static void main(){
        Scanner src = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = src.nextInt();

        int sum = 0;
        int []a = new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            a[i]=src.nextInt();
            sum = sum+a[i];
        }
        System.out.println("Sum :"+sum);
    }
}
