package LEC21;

import java.util.*;
public class Main4 {
    public static void main(){
        NewThread t2 = new NewThread();
        for(int i=0;i<5;i++){
            System.out.println(i+"main");
        }
        t2.start();
        try{t2.join();}
        catch(Exception e){

        }



    }
}
