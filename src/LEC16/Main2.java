package LEC16;
//Comparable inbuilt interface -
//Syntax - class <name of class> implements Comparable<datatype>

import java.util.*;

class Student implements Comparable <Student>{
    String name;
    int Roll;

    public Student(int Roll,String name){
        this.name=name;
        this.Roll=Roll;
    }
    public int compareTo(Student s1){
        return this.Roll-s1.Roll;
    }
    public String toString(){
        return Roll+" : "+name;
    }


}


public class Main2 {
    public static void main(){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student (50,"Om"));
        list.add(new Student(30,"Narayan"));
        Collections.sort(list);
        System.out.println(list.toString());
    }

}
