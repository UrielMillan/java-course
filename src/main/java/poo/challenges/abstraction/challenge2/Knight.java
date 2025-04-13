package poo.challenges.abstraction.challenge2;

public class Knight extends Warrior{
    private boolean canAttack;

    public Knight(String name) {
        this.name = name;
        this.health = 100;
        this.canAttack = true;
    }


    @Override
    void attack(Warrior opponent) {
        if(this.canAttack) {
            System.out.println("El caballero embiste con su lanza -25 HP");
            opponent.takeDamage(25);
            this.canAttack = false;
        }else {
            System.out.println("El caballero se prepara para el siguiente ataque");
            this.canAttack = true;
        }
    }
}
