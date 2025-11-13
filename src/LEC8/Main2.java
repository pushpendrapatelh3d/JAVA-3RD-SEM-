package LEC8;




//Simple Inheritance

public class Main2 {

    static class father{
        void print(){
            System.out.println("This is father ");
        }
    }

    static class child extends father{
        void printout(){
            System.out.println("This is child ");
        }
    }


    public static void main(){
        child obj = new child();
        obj.printout();
        obj.print();


    }
}
