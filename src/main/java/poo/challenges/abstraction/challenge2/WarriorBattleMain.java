package poo.challenges.abstraction.challenge2;

public class WarriorBattleMain {
    public static void main(String[] args) {
        Warrior opponent1 = WarriorFactoryCreator.create(WarriorClassesEnum.getRandomClass(), "Archeus");
        Warrior opponent2 = WarriorFactoryCreator.create(WarriorClassesEnum.getRandomClass(), "Bastion");


        do{
            opponent1.attack(opponent2);
            opponent2.attack(opponent1);
        }while (opponent1.isAlive() && opponent2.isAlive());

        if(opponent1.isAlive()){
            System.out.println("El ganador es " + opponent1.getName());
        }else{
            System.out.println("El ganador es " + opponent2.getName());
        }
    }
}
