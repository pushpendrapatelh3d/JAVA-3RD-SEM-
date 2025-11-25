package LEC13;



public class Main4 {
    public static class B{
        final int a;
        B(int part){
           a=part;
           System.out.println(a);
        }
    }
    public static void main(){
        B obj = new B(4);
        B obj1 = new B(10);
    }
}
