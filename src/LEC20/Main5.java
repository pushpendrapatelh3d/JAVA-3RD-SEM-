package LEC20;

import java.io.File;

public class Main5 {
    public static void main(){
        try{
            File file = new File("He.php");

            if(file.delete())
                System.out.println("Deleted");
            else
                System.out.println("not deleated");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
