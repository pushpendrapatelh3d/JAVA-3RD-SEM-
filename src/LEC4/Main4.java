package LEC4;

import java.util.Scanner;
import java.lang.String;
import java.lang.System;
import java.util.Arrays;

public class Main4 {

    public static void main(){
        String str = "hello";
        String str1 ="olehl";


        char ch1[] = str.toCharArray();
        char  ch2[] = str1.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String val1 = new String(ch1);
        String val2 = new String(ch2);

        if(val1.equals(val2)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }


}
