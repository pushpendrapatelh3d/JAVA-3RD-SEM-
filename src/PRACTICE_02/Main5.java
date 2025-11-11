package PRACTICE_02;

public class Main5 {
    public static void main(){
        int a = 1234;
        int b = 0;
        System.out.println(a);
        while(a%10!=0){
            b = (b*10)+ (a%10);
            a = a/10 ;
        }

        System.out.println(b);
    }
}
