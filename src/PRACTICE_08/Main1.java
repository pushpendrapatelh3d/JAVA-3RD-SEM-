package PRACTICE_08;

import java.util.*;

class student{

    int rollnumber ;
    String name;
    float marks;
    public  void display(){
        System.out.println(this.name);
        System.out.println(this.rollnumber);
        System.out.println(this.marks);
        System.out.println();


    }


};

public class Main1 {
    public static void main(){
        student obj1 = new student();
        obj1.rollnumber = 120;
        obj1.name="Suresh";
        obj1.marks=80;
        student obj2 = new student();
        obj2.rollnumber = 50;
        obj2.name="Mamesh";
        obj2.marks=80;
        student obj3 = new student();
        obj3.rollnumber = 80;
        obj3.name="Ramesh";
        obj3.marks=80;

        obj1.display();
        obj2.display();
        obj3.display();

    }

}
