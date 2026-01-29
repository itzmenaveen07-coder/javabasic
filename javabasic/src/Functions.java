import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Functions {
   public static void charc(){

        String a = "zoho corporation chennai";
        char[] b = a.toCharArray();
        StringBuilder count = new StringBuilder(" ");
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : b)
        {
            if(Character.isUpperCase(c))
            {
               count.append(Character.toLowerCase(c));
            }
            else if((Character.isLowerCase(c)))
            {
                count.append(Character.toUpperCase(c));
            }
            else
            {
                map.put(c, map.getOrDefault(c, 0) + 1);

            }

        }
        System.out.println(count);
//        System.out.println(count1);
        System.out.println(" " +map);
//        List<String> words = List.of("Stream", "is", "awesome");
//        Arrays.stream(a.split(" "));
//        System.out.println(a);
//        words.stream().map(String::toUpperCase).forEach(System.out::println);
//        System.out.println(words);

    }
}


