class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1: " + i);

            if (i == 2) {
                Thread.yield();   // Transfer control
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Thread 2: " + i);
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