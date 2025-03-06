package poo.challenges.abstraction.challenge1;

public class ElectricCar extends  Transport implements Ecofriendly {
    public double energyLevel;

    public ElectricCar(double energyLevel) {
        this.energyLevel = energyLevel;
    }


    @Override
    void move() {
        System.out.println("El auto electrico se esta moviendo");
        speed = 100;
    }

    @Override
    public void reduceEmissions() {
        System.out.println("El auto electrico esta en modo ecofriendly");
    }
}
