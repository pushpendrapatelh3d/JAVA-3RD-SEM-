package LEC22;

import java.util.*;

public class Main5 {
    public static void main(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        List<Integer> result= list.stream().filter(n->n>5).toList();
        List<Integer> result1= result.stream().filter(n->n%2==1).toList();
        int result2 = result1.stream().reduce(0,(a,b)->a+b);
        System.out.println("Elements greater than 5 :"+result);
        System.out.println("Remaining odd elements of arraylist :"+result1);
        System.out.println(result2);
    }
}
