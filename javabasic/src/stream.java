import java.util.Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class stream {
    // Creating a list of names
    public static void filter() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream().filter(j -> j.endsWith("e")).forEach(System.out::println);

    }

    public void filterusinghash() {
        HashMap<String, Integer> hash = new HashMap<>();
        // Add key-value pairs to the HashMap
        hash.put("Naveen", 100);
        hash.put("Akash", 50);
        hash.put("kiran", 40);
        hash.entrySet().stream().filter(a -> a.getKey().equalsIgnoreCase("av"))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    public static void map() {
        List<String> words = Arrays.asList("hello", "world", "java");
        words.stream().map(String::toUpperCase).forEach(System.out::println);  // Converts all words to uppercase
    }

    public static void mapusinghash() {
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("Naveen", 100);
        hash.put("Akash", 200);
        hash.put("praveen",500);
        hash.put("kiran", 300);
        hash.entrySet().stream().map(j -> Map.entry(j.getKey(), j.getValue() + 10)).
                forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));;
                System.out.println("hash :" + hash);

    }

    
}