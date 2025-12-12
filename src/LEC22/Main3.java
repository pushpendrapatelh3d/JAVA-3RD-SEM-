package LEC22;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        List<Integer> result= list.stream().map(n->n*2).toList();
        System.out.println(result);
    }
}
