package LEC19;

public class Main4 {

    public static void main(){
         try{
             voteage(12);
         }catch(Exception e){
             System.out.println(e);
        }
        try{
            voteage(19);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    static void voteage(int x){

        if(x<18){
            throw new IllegalArgumentException("Aap vote nhi kar sakte ");
        }
        else{
            System.out.println("Eligible for voting");
        }
    }

}
