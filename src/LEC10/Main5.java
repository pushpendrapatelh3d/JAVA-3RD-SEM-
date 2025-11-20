package LEC10;
// abstract class

abstract class Mink{
 abstract void eat();
}

class species extends Mink{
    void eat(){
        System.out.println("Mink eats something .");
    }

}

public class Main5 {
    public static void main(){
        Mink obj = new species();
        obj.eat();
    }

}
