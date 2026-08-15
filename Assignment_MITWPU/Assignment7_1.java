class Thread1 extends Thread {
    public void run() {
        try{
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1: " + i);
            Thread.sleep(1000);
            if (i == 2) {
                System.out.println("Tranfering Control to thread 2 ");
                Thread.yield();   // Transfer control
            }
        }
    }catch(Exception e)
    {

    }
    }
}
class Thread2 extends Thread {
    public void run() {
        try{
        for (int i = 10; i >= 1; i--) {
            System.out.println("Thread 2: " + i);
            Thread.sleep(1000);
        }
        }catch(Exception e)
    {

    }
    }
}

public class Assignment7_1 {
    public static void main(String args[]) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}