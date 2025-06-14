package threads.examples.runnable;

public class RunnableLambaTaskMain {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
                System.out.println("finished " + Thread.currentThread().getName());
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        };

        new Thread(runnable,"Erick work").start();
        new Thread(runnable,"Jenny work").start();
        new Thread(runnable,"John work").start();
    }
}
