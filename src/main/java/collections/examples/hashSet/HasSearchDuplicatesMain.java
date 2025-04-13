package collections.examples.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HasSearchDuplicatesMain {

    public static void main(String[] args) {
        String[] fishes = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado", "Corvina"};
        Set<String> uniques = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        //Save duplicates and uniques elements in different sets
        for(String fish : fishes) {
            if(!uniques.add(fish)) {
               duplicates.add(fish);
            }
        }

        //Remove duplicates from uniques
        uniques.removeAll(duplicates);

        System.out.println("Unique elements " + uniques);
        System.out.println("duplicates elements " + duplicates);
    }
}
