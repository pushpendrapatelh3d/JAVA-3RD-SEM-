package LEC9;

  class hello{//function overloading
     static public void sum(){
         System.out.println("hello");
     }
     static public void sum(int a){
         System.out.println(a);
     }
     static public void sum(int a,int b){
         System.out.println("Sum of"+a+"and"+b+":"+(a+b));
     }

}

public class Main1 {
     //hello obj = new hello();
    public static void main() {
        hello obj = new hello();

        obj.sum();
        obj.sum(8);
        obj.sum(9, 10);
    }
}
