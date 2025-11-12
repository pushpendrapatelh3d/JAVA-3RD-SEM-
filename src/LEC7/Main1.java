package LEC7;

import java.util.Scanner;



public class Main1 {
    static class Car{
        static void display(String name){
            System.out.println(name);
        }
    }

    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        String result = src.nextLine();
        Car.display(result);

    }
}
