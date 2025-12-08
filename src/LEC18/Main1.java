package LEC18;

import java.util.*;

public class Main1 {
    public static void main(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
