package LEC18;

import java.util.*;

public class Main11 {
    public static void main(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(5);
        list.add(14);
        list.add(3);
        list.add(10);

        ListIterator<Integer> it = list.listIterator();
        System.out.println(list);
        while(it.hasNext()){
            Integer x = it.next();
            if(x==14)
            {
                Integer y = x;
                while (it.hasPrevious()) {
                    x= it.previous();
                    if(x<y)
                    it.remove();
                }
                break;
            }
        }
        System.out.println(list);
    }
}
