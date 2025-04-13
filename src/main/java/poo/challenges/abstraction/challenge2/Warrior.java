package poo.challenges.abstraction.challenge2;

public abstract class Warrior {
    protected String name;
    protected int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    abstract void attack(Warrior opponent);

    void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(this.name + " took " + damage + " damage");
    }

    boolean isAlive() {
        return health > 0;
    }
}
