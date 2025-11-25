package LEC14;

import java.util.ArrayList;

public class Main8 {

    public static void main(){
        ArrayList<Integer> list=new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for(int n : list)
        {
            System.out.println(n);
        }

        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }




    }

}
