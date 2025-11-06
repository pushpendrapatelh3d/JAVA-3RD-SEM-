package LEC3;

import java.util.Scanner;
import java.lang.String;
import java.lang.System;



public class Main11 {
    public static void main(String[] args) {
        String a = "abc";
        int count=0;
        for(int i=0;i<(a.length());i++){
            switch(a.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    count++;
                    break;

                default:
                    break;
            }
        }

        System.out.println("vowels count :"+count);


    }

}
