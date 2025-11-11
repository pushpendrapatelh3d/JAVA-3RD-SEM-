package LEC6;

public class Main2 {

    int a=5;//can be accesed by creating objext not a static member

    public static void main(){
        Main2 obj = new Main2();
        System.out.println(obj.a);
    }
}
