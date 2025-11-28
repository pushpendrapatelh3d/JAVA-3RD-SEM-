package LEC17;

import java.util.*;

public class Main3 {
    public static void main(){
        int a[] = {1,2,3,4,5};
        int b[] = {3,4,5,6,7};
        HashSet<Integer> set = new HashSet<>();
        for( int i=0;i< a.length;i++ ){
            set.add(a[i]);
        }
        HashSet<Integer> result = new HashSet<>();
        for( int x: b ){
            if(set.contains(x))
            {
                result.add(x);
            }
        }
        System.out.println(result);
    }
}
