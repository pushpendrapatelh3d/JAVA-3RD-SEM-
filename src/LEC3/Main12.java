package LEC3;

import java.util.Scanner;
import java.lang.String;
import java.lang.System;



public class Main12 {
    public static void main(String[] args) {
        String str = "hello java cpp";
        String a[]=str.split(" ");// creates 3 array ["hello","java","cpp"]
        for(String str1 : a){
            System.out.println(str1);

        }


    }

}
