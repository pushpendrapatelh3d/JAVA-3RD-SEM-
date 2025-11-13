package LEC8;

public class Main5 {
    static class employee{
        void work(){
            System.out.println("Employee works hard");

        }
    }

    static class manager extends employee{
        void attendmeeting(){
            System.out.println("Manager manages working of other employees ");
        }
    }

    public static void main(){
        manager obj = new manager();
        obj.attendmeeting();
        obj.work();
    }
}
