package poo.challenges.abstraction.challenge3;

public interface Combatant {
    abstract void attack(Combatant opponent);
    abstract void defense();
    abstract boolean isAlive();
    abstract void takeDamage(int damage);
}
