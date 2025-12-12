package LEC22;

import java.util.*;
public class Main7 {
    public static void main(){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            List<Integer>  limit = list.stream().limit(3).toList();
            System.out.println(limit);
    }
}
