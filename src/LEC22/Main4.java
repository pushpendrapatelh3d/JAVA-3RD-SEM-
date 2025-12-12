package LEC22;

import java.util.*;

public class Main4 {
    public static void main(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int result = list.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);
    }
}
