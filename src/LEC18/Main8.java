package LEC18;

import java.util.*;


public class Main8 {
    public static void main(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            Integer x = it.next();
            System.out.println(x);
            if(x==4)
            {
                while (it.hasPrevious()) {
                    x= it.previous();
                    System.out.println(x);
                }
                break;
            }
        }


    }
}
