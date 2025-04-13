package collections.examples.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HasSetSearchUniquesMain {

    public static void main(String[] args) {
        String[] fishes = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado", "Corvina"};
        Set<String> uniques = new HashSet<>();

        for(String fish : fishes) {
            if(!uniques.add(fish)) {
                System.out.println("Element duplicated: " + fish);
            }
        }

        System.out.println(uniques.size() + " unique elements");
    }
}
