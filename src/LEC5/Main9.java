package LEC5;

public class Main9 {
    public static void main()
    {

        StringBuilder str = new StringBuilder("oppo");
        StringBuilder str1= new StringBuilder(str.reverse());
        if(str.equals(str1)) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a pallindrome");
        }
    }
}
