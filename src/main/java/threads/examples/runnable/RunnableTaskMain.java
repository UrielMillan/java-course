package threads.examples.runnable;

public class RunnableTaskMain {
    public static void main(String[] args) {
        new Thread(new RunnableTask("Erick work")).start();
        new Thread(new RunnableTask("Jenny work")).start();
        new Thread(new RunnableTask("John work")).start();
    }
}
