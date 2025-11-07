package LEC4;

import java.util.Scanner;
import java.lang.String;
import java.lang.System;



public class Main2 {
    public static void main(String[] args){
        String str = "java is more powerful";
        System.out.println(str);
        String a[] = str.split(" ");

        String str2="";
        int max = 0;
        for( String str1 : a ){
            if(max < str1.length()){

                max = str1.length();
                 str2 = str1;
            }

        }

        System.out.println(str2);
        System.out.println("max length :" + max);

    }
}
