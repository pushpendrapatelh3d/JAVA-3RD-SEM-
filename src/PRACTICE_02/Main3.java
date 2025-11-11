package PRACTICE_02;

import java.util.Scanner;
import java.lang.*;

public class Main3 {
    public static void main(){
        char ch ;
        System.out.println("enter a character :");
        Scanner src = new Scanner(System.in);
        ch = src.next().charAt(0);
        int n;
        n = (int)(ch);
        System.out.println("ASCII VALUE :"+n);

    }
}
