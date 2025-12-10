package LEC20;
import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(){
        try {
            FileWriter writer = new FileWriter("H.html");
            writer.write("<p>Hello bro !</p>");//used to insert data in file
            writer.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
