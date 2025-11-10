package LEC5;

import java.lang.*;

public class Main7 {
    public static void main(){
        StringBuilder str = new StringBuilder("i love java");
        //
        System.out.println(str);
        //
        StringBuilder str1 = new StringBuilder(str.substring(0,1));
        StringBuilder str2 = new StringBuilder(str.substring(1,6));
        StringBuilder str3 = new StringBuilder(str.substring(7,11));

        str1 = str1.reverse();
        str2 = str2.reverse();
        str3 = str3.reverse();

        StringBuilder result = new StringBuilder(str1+" "+str2+" "+str3);




        System.out.println(result);
    }
}
