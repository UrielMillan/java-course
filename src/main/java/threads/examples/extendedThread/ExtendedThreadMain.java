package threads.examples.extendedThread;

public class ExtendedThreadMain {


    public static void main(String[] args) {
        Thread thread = new ExtendedThread("Erick thread");
        thread.start();
        Thread thread2 = new ExtendedThread("Gabriel thread");
        thread2.start();
        Thread thread3 = new ExtendedThread("Jenny thread");
        thread3.start();
    }
}
