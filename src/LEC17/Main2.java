package LEC17;

import java.util.*;

public class Main2 {
    public static void main(){
        int a[] = {1,3,2,5,7};

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i< a.length;i++){
            set.add(a[i]);
        }
        if(set.size()==5)
            System.out.println("duplicate element not exist");
        else
            System.out.println("duplicate element exist");
    }
}
