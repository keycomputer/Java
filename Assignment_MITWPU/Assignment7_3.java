class ThreadA extends Thread {
    public void run() {
        for (int i = 10; i <= 20; i++) {
            System.out.println("Thread A: " + i);

            if (i == 11) {
                try {
                    Thread.sleep(1000); // Pause for 1 second
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
class ThreadB extends Thread {
    public void run() {
        for (int i = 20; i >= 1; i--) {
            System.out.println("Thread B: " + i);
        }
    }
}
public class Assignment7_3 {
    public static void main(String args[]) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();

        t1.start();
        t2.start();
    }
} 
    

