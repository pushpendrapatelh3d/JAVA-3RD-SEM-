package LEC4;

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

public class Main3 {
    public static void main(){
        String str = "aabc";
        int freq[] = new int[256];
        for(char ch:str.toCharArray())
        {
            freq[ch]++;
        }
        for(int i = 0 ; i < 256 ; i++){
            if(freq[i]>0){
                System.out.println((char)i + "->" + freq[i]);
            }
        }
    }
}
