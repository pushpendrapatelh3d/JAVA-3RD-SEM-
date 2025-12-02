package PRACTICE_05;

import java.util.Scanner;

public class Main4 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        System.out.println("Enter elements :");
        int []a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Reversed array :");
        for(int i=n-1;i>=0;i--){
            System.out.println(a[i]);
        }

    }
}
