package LEC22;


class MyThread implements Runnable{
    public void run(){
        System.out.println("Hello");
    }
}

public class Main1 {
    public static void main(){
        MyThread task = new MyThread();
        Thread obj1 = new Thread(task);
        obj1.start();


    }
}
