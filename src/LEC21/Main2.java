package LEC21;


class MyThread extends Thread{
    public void run(){
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.println(i+"t1");
        }
    }
}


public class Main2 {
    public static void main(){
        MyThread t1 = new MyThread();
        t1.start();
        for(int i=0;i<5;i++){
            System.out.println(i+"main");
        }
    }
}
