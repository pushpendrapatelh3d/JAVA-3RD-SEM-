package LEC3;

import java.util.Scanner;
import java.lang.String;
import java.lang.System;



public class Main10 {
    public static void main(String[] args){
        String a = "abc";
        String b = "";

        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);//OLD STRING IS IM-MUTTABLE , BUT THE STRING IS RENEWED/RECREATED
        }

        System.out.println(a);
        System.out.println(b);

        if(a.equals(b))
            System.out.println("Yes");
        else
            System.out.println("No");



    }

}