package LEC4;

import java.util.Scanner;
import java.lang.String;
import java.lang.System;

public class Main1 {
    public static void main(String[] args){
        String str =  "hello world";
        int v = 0 ;
        for(char ch: str.toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                v++;
            }
        }
        System.out.println("vowel count :" + v);
    }

}
