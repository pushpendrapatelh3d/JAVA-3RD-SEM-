package LEC8;

public class Main1 {

      static class Multiple{
        public Multiple(){
            System.out.println("hiiii");
            this(4);//constructor chaining

        }

        public Multiple(int a){
            System.out.println(a);
            this(9,7);
        }

        public Multiple(int a,int b){
            System.out.println(a+"and"+b);

        }
    }

    public static void main(){
        Multiple obj = new Multiple();

    }
}
