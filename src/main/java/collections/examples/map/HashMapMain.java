package collections.examples.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String, Object> person = new HashMap<>();

        // the keys always are unique
        person.put("name", "John");
        person.put("lastName", "House");
        person.put("email", "Jhon@gmail.com");
        person.put("age", "25");

        System.out.println("person = " + person);

        // Get values using the keys
        String name = (String) person.get("name");
        String lastName = (String) person.get("lastName");
        String email = (String) person.get("email");
        String age = (String) person.get("age");

        System.out.println("name = " + name);
        System.out.println("lastName = " + lastName);
        System.out.println("email = " + email);
        System.out.println("age = " + age);


        //Create a related HashMap
        Map<String ,String> address = new HashMap<>();
        address.put("country", "USA");
        address.put("city", "New York");
        address.put("state", "NY");
        address.put("street", "San Francisco");
        address.put("number", "94105");

        person.put("address", address);

        //Get related HasMap
        Map<String, String> currentAddress = (Map<String, String>) person.get("address");
        String country = (String) currentAddress.get("country");
        String city = (String) currentAddress.get("city");
        String state = (String) currentAddress.get("state");
        String street = (String) currentAddress.get("street");
        String number = (String) currentAddress.get("number");
        String postalCode = (String) currentAddress.getOrDefault("postalCode", "82199");

        System.out.println("country = " + country);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("street = " + street);
        System.out.println("number = " + number);
        System.out.println("postalCode = " + postalCode);


        // Remove and return the value, can remove using keys or key and value
        person.remove("lastName");
        person.remove("age", "25");
        System.out.println("person = " + person);

        // search value using key
        boolean existsValue = person.containsKey("lastName");
        System.out.println("existsValue = " + existsValue);

        // Convert values to Collection
        Collection<Object> values = person.values();
        for (Object value : values) {
            System.out.println("value = " + value);
        }

        // Convert keys to Set
        Set<String> keys = person.keySet();
        for (String key : keys) {
            System.out.println("key = " + key);
        }

        // Iterate using Entry
        for(Map.Entry<String, Object> pair: person.entrySet()) {
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }

        //Iterate using key
        for(String key: person.keySet()) {
            Object value = person.get(key);
            System.out.println(key + " = " + value);
        }

        //Iterate using forEach
        person.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });
    }
}
