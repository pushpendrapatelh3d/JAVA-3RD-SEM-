package LEC14;

import java.lang.classfile.constantpool.IntegerEntry;
import java.util.ArrayList;

public class Main1 {
    public static  void main(){
        ArrayList<Integer> list=new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(1,30);
        System.out.print(list);
    }
}
