package LEC15;

import java.util.HashMap;

public class Main3 {
    public static void main(){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(4, 40);
        map.put(5, 50);
        map.put(6, 60);
        System.out.println(map.getOrDefault(11,0));

    }
}
