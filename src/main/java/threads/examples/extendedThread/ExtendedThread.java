package threads.examples.extendedThread;

public class ExtendedThread extends Thread {
    public ExtendedThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is running");
            for (int i = 0; i < 5; i++) {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + " is running");
            }
            System.out.println(Thread.currentThread().getName() + " is stopped");
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
