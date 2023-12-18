class MyThread extends Thread {
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ": " + i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ": " + i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MT1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setName("MyThread");
        // t.setPriority(Thread.MIN_PRIORITY);
        // System.out.println(t.getPriority());
        // t.start();

        MyThread1 t1 = new MyThread1();
        t1.setName("MyThread1");

        t.start();
        try {
            t.join(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        t1.start();
    }
}