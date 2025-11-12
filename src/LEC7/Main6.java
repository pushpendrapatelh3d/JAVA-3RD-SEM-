package LEC7;
import java.lang.*;
public class Main6 {

    static class Bank{
        int acc_num;
        String acc_holder;
        float balance;
        void display(){

            System.out.println("Account number :"+this.acc_num);
            System.out.println("Account holder:"+this.acc_holder);
            System.out.println("balance :"+this.balance);

        }
    }

    public static void main(){
        Bank obj = new Bank();
        Bank obj1 = new Bank();
        obj.acc_num=1229045;
        obj1.acc_num=1229045;
        obj.acc_holder="Rahul";
        obj1.acc_holder="Rohan";
        obj.balance=1200.78f;
        obj1.balance=1400.78f;
        obj.display();
        obj1.display();
    }
}
