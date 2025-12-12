package LEC22;


import java.util.*;

public class Main2 {
    public static void main(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        List<Integer> result= list.stream().filter(n->n>20).toList();
        System.out.println(result);
    }
}
