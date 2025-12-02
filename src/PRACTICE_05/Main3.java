package PRACTICE_05;

import java.util.Scanner;

public class Main3 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        System.out.println("Enter elements :");
        int []a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to search :");
        int key=sc.nextInt();
        boolean b = false;
        for(int i=0;i<n;i++){
            if(a[i]==key){
                b=true;
                break;
            }
        }
        if(b)
            System.out .println(key + " is present in array .");
        else
            System.out .println(key + " is not present in array .");
    }
}
