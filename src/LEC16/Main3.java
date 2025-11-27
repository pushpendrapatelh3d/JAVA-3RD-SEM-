package LEC16;

import java.util.*;

class NameSorted implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}

public class Main3 {
    public static void main(){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student (50,"Narayan"));
        list.add(new Student(30,"Om"));
        list.add(new Student(40,"Ankit"));

        Collections.sort(list,new NameSorted());
        System.out.println(list.toString());
        for(Student s: list){
            System.out.println(s.Roll + " : " + s.name);
        }
    }
}
