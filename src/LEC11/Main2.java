package LEC11;

interface A{
    abstract void menu();
}
class B implements A{
    public void menu(){
        System.out.println("Menu is present");
    }
}

public class Main2 {

    public static void main(){
        A obj = new B();
        obj.menu();
    }
}
