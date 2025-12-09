package LEC19;

public class Main5 {
    public static void main(){
        int a[]={6,-3,7,1,0,0};
        int k = 3;
        int max= a[0]+a[1]+a[2];
        for(int i=0;i<=a.length-k;i++){
            int n = a[i]+a[i+1]+a[i+2];
            if(n>max)
                max = n;
        }
        System.out.println("max :"+max);
    }
}
