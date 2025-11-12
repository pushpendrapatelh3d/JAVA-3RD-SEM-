package PRACTICE_03;

public class Main03 {
    static class Book{
        String title , author ;
        float price ;

        void disp_discount(){
            float f = this.price -(this.price*10)/100;
            System.out.println("Title of book :"+this.title);
            System.out.println("Author's name of this book :"+this.author);
            System.out.println("Actual price :"+this.price);
            System.out.println("Price after discount :"+f);
        }
    }
    public static void main(){
        Book obj = new Book();
        obj.author="Wisdom Cramos";
        obj.title="Nature and Innovation";
        obj.price=100f;
        obj.disp_discount();
    }
}
