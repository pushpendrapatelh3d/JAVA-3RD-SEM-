package LEC20;

import java.io.*;

public class Main3 {

        public static void main(){
            try{
                File file = new File("He.php");
                file.delete();
            }catch(Exception e){
                System.out.println(e);
            }
        }

}
