package PRACTICE_01;
import java.util.Scanner;

public class Main4 {
    public static void main()
    {
        System.out.println("enter a number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%11==0 && a%5==0)
            System.out.println("Divisible by 5 and 11");
        else if(a%5==0)
            System.out.println("Divisible by 5");
        else if(a%11==0)
            System.out.println("Divisible by 11");
        else
            System.out.println("Not divisible by 5 and 11");
    }
}
