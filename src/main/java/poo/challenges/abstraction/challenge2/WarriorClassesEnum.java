package poo.challenges.abstraction.challenge2;

import java.util.Random;

public enum WarriorClassesEnum {
    SAMURAI, ARCHER, KNIGHT;

    //Funcion estatica que retorna una clase random
    public static WarriorClassesEnum getRandomClass(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
