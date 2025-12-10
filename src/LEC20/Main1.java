package LEC20;

import java.io.*;
import java.util.*;
//file creation code
public class Main1 {
    public static void main(){
        try{
            File file = new File("New.php");
            if(file.createNewFile()){
                System.out.println("file created "+file.getName());
            }
            else{
                System.out.println("file alredy exists "+file.getName());
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
