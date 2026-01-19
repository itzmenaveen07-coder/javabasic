//import java.util.ArrayList;
//import java.util.Arrays;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class stream {
//    // Creating a list of names
//    public static void filter() {
//        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));
//        names.add("kiran");
//        names.stream().filter(j -> j.endsWith("e")).forEach(System.out::println);
//        names.stream().filter(i -> i.startsWith("B")).forEach(System.out::println);
//        names.remove("Alice");
//        System.out.println(names);
//        names.stream().map(list -> list.toLowerCase()).forEach(System.out::println);
//    }
//}
//    public static void sortlist()
//    {
//        ArrayList<Integer> m = new ArrayList<>(Arrays.asList(3, 57, 8, 8, 4, 3));
//        List<Integer> result =
//                m.stream().sorted().filter(x -> x > 3).toList();
//        System.out.println(result);
//    }
//    void filterusinghash()
//    {
//        HashMap<String, Integer> hash = new HashMap<>();
//        // Add key-value pairs to the HashMap
//        hash.put("Naveen", 100);
//        hash.put("Akash", 50);
//        hash.put("kiran", 40);
//        hash.entrySet().stream().filter(a -> a.getKey().equalsIgnoreCase("av"))
//                .forEach(b -> System.out.println(b.getKey() + ": " + b.getValue()));
//    }
//    public static void map()
//    {
//        List<String> words = Arrays.asList("hello", "world", "java");
//        words.stream().map(String::toUpperCase).forEach(System.out::println);  // Converts all words to uppercase
//    }
//
//    public static void mapusinghash()
//    {
//        Hashtable<String, Integer> hash = new Hashtable<>();
//        hash.put("Naveen", 100);
//        hash.put("Akash", 200);
//        hash.put("praveen", 500);
//        hash.put("ajay", 300);
//        hash.entrySet().stream().map(j -> Map.entry(j.getKey(), j.getValue() + 10)).
//                forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
//        System.out.println("hash :" + hash);
//    }
//}
//
//
