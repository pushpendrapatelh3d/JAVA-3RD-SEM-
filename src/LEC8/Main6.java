package LEC8;

import  java.util.Scanner;

public class Main6 {
    static class person{
        String name;
        void displayName(){
            System.out.println(name);
        }
    }

    static class student extends person{
        int n;
        void displayClass(){
            System.out.println("Class of "+name+":"+n);
        }
    }

    static class monitor extends student{
        void checkDiscipline(){

            System.out.println("All students are disciplined");
        }
    }

    public static void main(){
        monitor obj = new monitor();
        Scanner src = new Scanner(System.in);
        System.out.println("Enter students's name :");

         obj.name = src.nextLine();

        System.out.println("Enter standard of students :");
        obj.n = src.nextInt();
        obj.displayName();
        obj.displayClass();
        obj.checkDiscipline();


    }
}
