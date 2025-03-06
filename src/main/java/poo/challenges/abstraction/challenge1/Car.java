package poo.challenges.abstraction.challenge1;

public class Car extends Transport{
    private double fullLevel;

    public Car(double fullLevel) {
        this.fullLevel = fullLevel;
    }

    public double getFullLevel() {
        return fullLevel;
    }

    public void setFullLevel(double fullLevel) {
        this.fullLevel = fullLevel;
    }

    public double getSpeed() {
        return speed;
    }

    public void refuel() {
        this.fullLevel = 100.0;
    }

    @Override
    void move() {
        System.out.println("El carro se esta moviendo");
    }
}
