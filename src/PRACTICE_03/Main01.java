package PRACTICE_03;

public class Main01 {
    static class Car {
        String brand, model;
        float price;

        void disp_details() {
            System.out.println("Brand :" + this.brand);
            System.out.println("model:" + this.model);
            System.out.println("Price:" + this.price);
        }
    }
    public static void main(){
        Car obj = new Car();
        Car obj1 = new Car();
        obj.brand="HYUNDAI";
        obj.model="Y908865QE";
        obj.price=600000;
        obj1.brand= "NISSAN";
        obj1.model="X4600ERT";
        obj1.price=4500000f;
        obj.disp_details();
        obj1.disp_details();
    }
}
