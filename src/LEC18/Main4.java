package LEC18;

import java.util.*;

public class Main4 {
    public static void main(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            if(it.next()==4)
                it.set(10);
        }
        System.out.println(list);
    }
}
