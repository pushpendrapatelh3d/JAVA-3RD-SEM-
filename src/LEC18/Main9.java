package LEC18;

import java.util.*;


public class Main9 {
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
        int a = list.size();
        int m = a/2;
        while(it.hasNext()&&it.nextIndex()<=m){
            Integer x = it.next();
            System.out.println(x);
        }
        while(it.hasPrevious()){
            Integer y = it.previous();
            System.out.println(y);
        }
    }
}
