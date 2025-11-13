package LEC8;

public class Main4 {

    static class aquaticanimal {
        void print(){
            System.out.println("Aquatic animals live in water ");
        }
    }

    static class alligator extends aquaticanimal {
        void printout(){
            System.out.println("This is alligator ");
        }
    }

    static class megalodon extends aquaticanimal{
        void printing(){
            System.out.println("This is megalodon");
        }
    }

    public static void main(){
        alligator obj = new alligator();
        megalodon obj1 = new megalodon();
        obj.print();
        obj.printout();
        obj1.print();
        obj1.printing();



    }

}
