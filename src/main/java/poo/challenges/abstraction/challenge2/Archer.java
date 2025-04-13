package poo.challenges.abstraction.challenge2;

public class Archer extends Warrior {

    public Archer(String name) {
        this.name = name;
        this.health = 100;
    }

    @Override
    void attack(Warrior opponent) {
            if(Math.random() < 0.5) {
                System.out.println("El arquero dispara una flecha -15 HP");
                opponent.takeDamage(15);
            }else{
                System.out.println("El arquero disparó, pero falló");
            }
    }
}
