package PRACTICE_07;

public class Main1 {
    public static void main(){
        String str = "Pushpendra patel";
        int count = 0;
        for(char c: str.toCharArray()){
            if("aeiouAEIOU".indexOf(c)!=-1){
                count++;
            }
        }
        System.out.println("Vowels :"+count);
    }
}
