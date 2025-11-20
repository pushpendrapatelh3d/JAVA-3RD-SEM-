package LEC10;

//method overriding

class animal{
    void eat(){
        System.out.println("Meat");
    }
}

class dog{
    void eat(){
        System.out.println("Bone");
    }
}

public class Main1 {
    public static void main(){
        dog obj = new dog();
        obj.eat();
    }
}
