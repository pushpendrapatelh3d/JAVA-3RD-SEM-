package LEC14;

import java.util.ArrayList;

public class Main6 {

    public static void main(){
        ArrayList<Integer> list=new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        boolean exist = list.contains(3);
        System.out.println("3:"+exist);
        boolean exist1 = list.contains(10);
        System.out.println("10:"+exist1);



    }
}
