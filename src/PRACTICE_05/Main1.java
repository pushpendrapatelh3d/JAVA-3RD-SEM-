package PRACTICE_05;

import java.util.*;

public class Main1 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        System.out.println("Enter elements :");
        int []a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Max Value(element) :"+max);
    }
}
