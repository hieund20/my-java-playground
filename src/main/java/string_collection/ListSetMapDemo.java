package string_collection;

import java.util.*;

public class ListSetMapDemo {

    public static void main(String[] args) {

        //List
        List<String> names = new ArrayList<>();
        names.add("Hieu");
        names.add("An");
        names.add("Hieu"); //same
        System.out.println("List: " + names);

        //Loop through list
        for (String name: names) {
            System.out.println("name: " + name);
        }

        //Set
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("Set (unique): " + uniqueNames);

        //Map
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Hieu", 90);
        scores.put("An", 85);
        scores.put("Minh", 50);

        System.out.println("Map (score): " + scores);

        //Loop through Map
        for(Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " have score " + entry.getValue());
        }

        //Check key
        if (scores.containsKey("An")) {
            System.out.println("An have score: " + scores.get("An"));
        }
    }
}
