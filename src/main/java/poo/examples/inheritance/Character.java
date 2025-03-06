package poo.examples.inheritance;

public class Character {
    private String name;
    private Double health;
    private int level;

    public Character(String name, Double health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public Character(String name) {
        this(name, 100.0,0);
    }

    public String getName() {
        return name;
    }

    public Double getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
