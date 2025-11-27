package LEC16;
import java.util.*;
import java.lang.classfile.constantpool.IntegerEntry;

public class Main1 {
    public static void main(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(5);
        list.add(9);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);

    }
}
