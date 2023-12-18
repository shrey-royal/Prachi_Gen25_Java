//way 2
// class MyThread extends Thread {
//     @Override
//     public void run() {
//         System.out.println("Run method Called");
//     }
// }

//way 3
class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Run method Called");
    }
}


public class CreateThread {
    public static void main(String[] args) {
        //way 1
        // Thread t1 = new Thread();
        // t1.start();
        
        // MyThread t = new MyThread();
        // t.start();

        MyThread t = new MyThread();
        t.run();
    }
}