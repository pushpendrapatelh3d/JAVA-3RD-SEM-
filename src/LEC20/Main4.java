package LEC20;

import java.io.FileReader;
import java.io.FileWriter;

public class Main4 {
    public static void main(){
        try {
            FileReader reader = new FileReader("H.html");
            System.out.println(reader.read());//return type of read() fuction integer and it returns ascii value of single character which it reads

            int ch;
            while((ch=reader.read())!=-1){
                System.out.print((char)ch);
            }
            reader.close();



        }catch(Exception e){
            System.out.println(e);
        }
    }
}
