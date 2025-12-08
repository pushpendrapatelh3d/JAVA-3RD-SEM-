package LEC18;

import java.util.*;

public class Main3 {
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
        System.out.println("Forward :");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Backward :");
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
