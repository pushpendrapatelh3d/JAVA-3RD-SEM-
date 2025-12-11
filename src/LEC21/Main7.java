package LEC21;

class thread3 extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=1;i<=10;i++){
            System.out.println("dowloding............"+i*10+"%");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Download Complete");

    }

}
class Main7{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        thread3 p3=new thread3();
        p3.start();
        //     try {
        //         p.join();
        //     } catch (Exception e) {

        //     }

    }
}
