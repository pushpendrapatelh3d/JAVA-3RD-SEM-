package LEC18;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main10 {
    public static void main(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(6);
        list.add(-5);
        list.add(4);
        list.add(3);
        list.add(-2);
        list.add(1);
        ListIterator<Integer> it = list.listIterator();
        System.out.println(list);
        while(it.hasNext()){
            Integer x = it.next();
            if(x<0)
                x=x*-1;

            it.set(x);


        }

        System.out.println(list);
    }
}
