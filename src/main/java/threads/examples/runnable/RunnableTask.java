package threads.examples.runnable;

public class RunnableTask implements Runnable {
    private String name;

    public RunnableTask(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " - " + name);
                Thread.sleep(1000);
            }
            System.out.println("finished " + name);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
