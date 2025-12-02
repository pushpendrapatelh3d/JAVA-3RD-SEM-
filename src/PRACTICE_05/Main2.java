package PRACTICE_05;

import java.util.*;


public class Main2 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size  of array :");
        int n = sc.nextInt();
        int []a=new int[n];
        int odd=0,even=0;
        System.out.println("Enter elements :");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0)
                even++;
            else
                odd++;
        }

        System.out.println("Even elements :"+even+","+"Odd elemtents :"+odd);

    }
}
