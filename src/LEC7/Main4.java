package LEC7;

public class Main4 {
    static class Call {
        int a;
        Call(int a){
            this.a=a;
            System.out.println(a);

        }
    }
    public static void main(){
        Call obj = new Call(5);
        Call obj2 = new Call(6);
        obj.a=3;
        obj2.a=4;
        System.out.println(obj.a);
        System.out.println(obj2.a);

    }
}
