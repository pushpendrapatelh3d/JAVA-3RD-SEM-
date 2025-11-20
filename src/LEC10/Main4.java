package LEC10;



class fish2{
    static void kill(){
        System.out.println(" no over riding");
    }

    void eat(){
        System.out.println("small fish");
    }

}

class shark2 extends fish2{
    static void kill(){
        System.out.println("over riding");
    }

     void eat(){
        System.out.println("meat");
    }

}

public class Main4 {
    public static void main(){
        fish2 obj = new shark2();


        obj.kill();
        obj.eat();
    }
}
