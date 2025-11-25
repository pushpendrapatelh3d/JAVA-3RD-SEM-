package LEC14;

import java.util.ArrayList;

public class Main3 {
    public static  void main(){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        list.add(5);
        list.add(10);
        list1.add(15);
        list1.add(20);
        list2.add(25);
        list2.add(30);
        list.addAll(list1);
        list.addAll(list2);
        //list.add(1,30);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));

    }
}
