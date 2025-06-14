package threads.examples.runnable;

public class RunnableAnonymousTaskMain {

    public static void main(String[] args) {

        //Obtenemos el thread principal
        Thread mainThread = Thread.currentThread();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(i + " - " + Thread.currentThread().getName());
                        Thread.sleep(1000);
                    }
                    System.out.println("finished " + Thread.currentThread().getName());
                    System.out.println("main thread " + mainThread.getState());
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        };


        try{
            Thread v1  = new Thread(runnable,"Erick work");
            Thread v2  = new Thread(runnable,"Jenny work");
            Thread v3 = new Thread(runnable,"John work");


            //Une todos los tiempos de ejecucion para bloquear al Thread principal
            v1.start();
            v2.start();
            v3.start();
            v1.join();
            v2.join();
            v3.join();

            //Se ejecuta al terminar todas las uniones de los tiempos
            System.out.println("Final, main thread " + mainThread.getState());
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
