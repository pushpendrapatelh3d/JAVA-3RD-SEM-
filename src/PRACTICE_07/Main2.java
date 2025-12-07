package PRACTICE_07;

public class Main2 {
    public static void main(){
        String now ="naman";
        String rev ="";
        for(int i=now.length()-1;i>=0;i--){
            rev += now.charAt(i);
        }
        System.out.println(now.equals(rev));
    }
}
