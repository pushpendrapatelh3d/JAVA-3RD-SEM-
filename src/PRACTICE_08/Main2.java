package PRACTICE_08;
import java.util.*;

class rectangle{
    float lenght,breadth;
    public void add(float l,float b){
        this.breadth=b;
        this.lenght=l;
    }
    public float clac_area(){
        float area = this.lenght*this.breadth;
        return area;
    }
    public float clac_perimeter(){
        float perimeter = (this.lenght+this.breadth)*2;
        return perimeter;
    }
}

public class Main2 {
    public static void main(){
        Scanner src = new Scanner(System.in);
        System.out.println("Enter length of rectangle :");
        float n=src.nextFloat();
        System.out.println("Enter length of rectangle :");
        float m=src.nextFloat();
        rectangle obj = new rectangle();
        obj.add(n,m);
        System.out.println("Area :"+obj.clac_area());
        System.out.println("Perimeter :"+obj.clac_perimeter());
    }
}
