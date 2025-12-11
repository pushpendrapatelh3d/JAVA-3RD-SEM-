package LEC21;

class NewThread extends Thread{
    public void run(){
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.println(i+"t1");
        }
    }
}

public class Main3 {
    public static void main(){
        NewThread t1 = new NewThread();
        t1.start();
        try{t1.join();}
        catch(Exception e){}
        for(int i=0;i<5;i++){
            System.out.println(i+"main");
        }
    }
}
