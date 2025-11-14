package LEC9;

public class Main5 {//row wise sum of 2d array eleements
    public static void main(){
        int a[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int sum;
        for(int i = 0 ; i<a.length;i++){
            sum=0;
            for(int j=0;j<a[i].length;j++){
                sum = sum + a[i][j];
            }
            System.out.println("Sum of elements of this array:"+sum);
        }


    }
}
