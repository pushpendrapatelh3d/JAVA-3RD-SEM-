package LEC6;

import java.util.Scanner;

class car{
     void display(String name){
         System.out.println(name);
     }
};
 
public class Main7 {
    public static void main(){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        car obj= new car() ;
        obj.display(input);
    }
}
