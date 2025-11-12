package LEC7;

public class Main5 {

    static class Rectangle{
        float length;
        float breadth;
        void area_perimeter(float l,float b){
            this.breadth=b;
            this.length=l;
            float a = length*breadth;
            float p = 2*(length+breadth);
            System.out.print("area ="+a+",perimeter ="+p);
        }
    }
    public static void main(){
        Rectangle obj = new Rectangle();
        Rectangle obj1 = new Rectangle();
        obj.area_perimeter(2,4);

    }
}
