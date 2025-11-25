package LEC11;

interface a{
    abstract void how();
}

interface b{
    abstract void how();
}

class c implements a,b{
    public void how(){
        System.out.println("How");
    }
}




public class Main3 {
    public static void main(){
        a obj = new c();
        obj.how();
        b obj2 = new c();
        obj2.how();
    }
}
