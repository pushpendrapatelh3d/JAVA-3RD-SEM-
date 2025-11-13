package LEC8;

public class Main3 {

    static class animal{
        void printing(){
            System.out.println("Animals are of various kind ");
        }
    }


    static class aquaticanimal extends animal{
        void print(){
            System.out.println("Aquatic animals live in water ");
        }
    }

    static class alligator extends aquaticanimal {
        void printout(){
            System.out.println("This is alligator ");
        }
    }


    public static void main(){
        alligator obj = new alligator();
        obj.printing();
        obj.print();
        obj.printout();
    }
}
