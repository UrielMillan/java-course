package poo.challenges.abstraction.challenge2;

public class Samurai extends Warrior {
    public Samurai(String name) {
        this.name = name;
        this.health = 100;
    }

    @Override
    void attack(Warrior opponent) {
        System.out.println("El samurai corta con su katana -20 HP");
        opponent.takeDamage(20);
    }
}
