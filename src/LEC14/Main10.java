package LEC14;

import java.util.LinkedList;

public class Main10 {
    public static void main(){
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }
}
