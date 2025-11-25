package LEC11;



interface A{
    abstract void menu();
}



public class Main2 {
    public static class B implements A{
        public void menu(){
            System.out.println("Menu is present");
        }
    }

    public static void main(){
        A obj = new B();
        obj.menu();
    }
}
