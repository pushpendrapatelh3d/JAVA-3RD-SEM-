package PRACTICE_02;
import java.util.Scanner;

public class Main4 {
    public static void main(){
        int n ;
        int fact = 1 ;
        System.out.println("enter a number :");
        Scanner src = new Scanner(System.in);
        n = src.nextInt();
        for(int i=n;i>=1;i--){
            fact = fact*i;
        }
        System.out.println("factorial of "+n+":"+fact);
    }
}
