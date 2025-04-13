package collections.examples.map;

import java.util.*;

public class TreeMapMain {
    public static void main(String[] args) {
        Map<String, Object> person = new TreeMap<>();

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
        Map<String ,String> address = new TreeMap<>(String::compareTo);
        address.put("country", "USA");
        address.put("city", "New York");
        address.put("state", "NY");
        address.put("street", "San Francisco");
        address.put("number", "94105");
        person.put("address", address);

        System.out.println("person = " + person);
    }
}
