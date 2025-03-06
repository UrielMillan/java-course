package poo.challenges.abstraction.challenge1;

public class Bicycle  extends Transport{

    public Bicycle() {
    }

    @Override
    void move() {
        System.out.println("La bicicleta esta pedaleado");
    }
}
