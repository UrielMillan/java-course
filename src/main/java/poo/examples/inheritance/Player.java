package poo.examples.inheritance;

public class Player extends Character{

    public Player(String name, Double health, int level) {
        super(name, health, level);
    }

    public Player(String name) {
        super(name);
    }
}
