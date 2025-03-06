package poo.challenges.abstraction.challenge1;

public abstract class Transport {
    protected double speed;

    abstract void move();

     void stop() {
        System.out.println("El transporte se ha detenido");
    }
}
