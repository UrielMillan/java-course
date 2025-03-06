package poo.challenges.abstraction.challenge1;

public class AbstractionMain {

    public static void main(String[] args) {
        Bicycle [] bicycles = {new Bicycle(), new Bicycle(), new Bicycle()};
        Car [] cars =  {new Car(100), new Car(80), new Car(40)};
        ElectricCar [] electricCars = {new ElectricCar(100), new ElectricCar(80)};

        for(Bicycle bicycle : bicycles){
            bicycle.move();
        }

        for(Car car : cars){
            car.move();
        }

        for(ElectricCar electricCar : electricCars){
            electricCar.move();
        }
    }
}
