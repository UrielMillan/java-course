package poo.examples.inheritance;

public class Enemy extends Character{

    public Enemy(String name, Double health, int level) {
        super(name, health, level);
    }

    public Enemy(String name) {
        super(name);
    }
}
