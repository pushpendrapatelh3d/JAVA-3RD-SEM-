package LEC21;


class Tank extends Thread{
    public void run(){
        String str = new String();
        str = "Tere ishq da jaam haseen ae\n" +
                "Subha haseen meri shaam haseen ae\n" +
                "Eh be-matlabi zindagi\n" +
                "Jado di tere naam haseen ae";

        try{
            for(char ch : str.toCharArray()){
                System.out.print(ch);
                Thread.sleep(200);
            }

        }catch(Exception e){
        }
    }
}

public class Main5 {
    public static void main(){
        Tank t1 = new Tank();
        t1.start();

    }
}