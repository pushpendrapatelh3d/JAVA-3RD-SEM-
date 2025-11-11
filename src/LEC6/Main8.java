package LEC6;

import java.util.Scanner;

 class Student{
    String name;
    int rollnumber;
    double marks;

    void setData(String name, int rollnumber, double marks) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;

    }

    void disp() {
        System.out.println("name : "+name);
        System.out.println("rollnumber :" + rollnumber);
        System.out.println("marks : "+marks);
    }
};

 public class Main8{
public static  void main (String[] args) {

    Student obj = new Student();
    Student obj1 = new Student();
    Student obj2 = new Student();
    obj.setData("Ram", 101, 78.5);
    obj1.setData("Shyam", 120, 56.9);
    obj2.setData("Sohan", 140, 79.7);
    obj.disp();
    obj1.disp();
    obj2.disp();
    }

}

