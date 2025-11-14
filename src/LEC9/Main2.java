package LEC9;

class myclass{
    void sum(int a,int b){
        System.out.println("Sum:"+(a+b));
    }
    void sum(int a,int b,int c){
        System.out.println("Sum:"+(a+b+c));
    }
    void sum(double a,double b){
        System.out.println("sum:"+(a+b));
    }

}

public class Main2 {
    public static void main(){
        myclass obj = new myclass();
        obj.sum(5,6);
        obj.sum(2,3,4);
        obj.sum(2.2d,7.8d);
    }

}
