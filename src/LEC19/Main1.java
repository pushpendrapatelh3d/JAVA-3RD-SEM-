package LEC19;

import java.util.*;


public class Main1 {
    public static void main(){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(20);
        list.add(14);
        list.add(3);
        list.add(10);
        list.add(3);
        list.add(10);

        Iterator <Integer> it = list.listIterator();
        int target = 10;
        while(it.hasNext()){
            if(it.next()==target){
                while(it.hasNext()){
                    System.out.println(it.next());
                }
                break;
            }
        }
    }
}
