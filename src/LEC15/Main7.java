package LEC15;

import java.util.HashMap;

public class Main7 {

    public static void main(){
        int a[]={2,7,5,4};
        HashMap<Integer,Integer> map = new HashMap<>();
        int target = 9;
        for(int i=0;i<a.length;i++){
            int diff = target - a[i];
            if(map.containsKey(diff)){
                System.out.println(map.get(diff)+" "+i);
                break;
            }
            map.put(a[i],i);
        }

    }
}
