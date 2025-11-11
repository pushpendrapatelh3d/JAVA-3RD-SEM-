package LEC6;

public class Main5 {

    static void checker(String str){
        for(int i=0;i<str.length()-1;i++){
            int count = 1;
            for(int j = i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    break;
                }
            }
            if (count == 1) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
    public static void main(){
        String str = "aabc";
        checker(str);


    }
}
