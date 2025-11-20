package LEC10;

//upper casting

class fish{
    void eat(){
        System.out.println("small fish");
    }
}

class shark extends fish{
    void eat(){
        System.out.println("meat");
    }
    void kill(){
        System.out.println("Small fishes");
    }
}

public class Main2 {
    public static void main(){
        fish obj = new shark();
        obj.eat();
    }
}
