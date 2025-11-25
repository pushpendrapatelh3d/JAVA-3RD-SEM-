package LEC14;

import java.util.ArrayList;

public class Main2 {
    public static  void main(){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        list.add(5);
        list.add(10);
        list1.add(5);
        list1.add(10);
        list2.add(5);
        list2.add(10);
        list.addAll(list1);
        list.addAll(list2);
        //list.add(1,30);
        System.out.print(list);
    }
}
