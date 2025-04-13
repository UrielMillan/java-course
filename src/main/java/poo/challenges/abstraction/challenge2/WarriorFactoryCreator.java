package poo.challenges.abstraction.challenge2;

public class WarriorFactoryCreator {
    public static Warrior create (WarriorClassesEnum type, String name) {
        return switch (type) {
            case SAMURAI -> new Samurai(name);
            case ARCHER -> new Archer(name);
            case KNIGHT -> new Knight(name);
            default -> throw new IllegalArgumentException("El tipo de warrior " + name + " no existe.");
        };
    }
}
