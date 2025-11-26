package LEC15;

import java.util.*;

public class Main6 {
    public static void main() {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "aaabccd";
        HashMap<Character, Integer> m = new HashMap<>();
        for(char ch :str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        for(char ch :str.toCharArray()){
            if(map.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }

    }
}
