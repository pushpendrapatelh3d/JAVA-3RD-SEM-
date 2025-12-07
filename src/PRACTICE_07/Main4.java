package PRACTICE_07;

public class Main4 {
    public static void main(){
        String str ="java is good";
        String rev ="";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
