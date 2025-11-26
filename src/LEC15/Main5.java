package LEC15;

import java.util.HashMap;

public class Main5 {

    public static void main() {
        HashMap<Integer, Integer> map = new HashMap<>();
        int a[] = {2,2,3,3,7,8,8,9};
        for (int x : a) {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);

    }
}

