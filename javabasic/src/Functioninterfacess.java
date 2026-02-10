import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static java.util.Arrays.stream;

public class Functioninterfacess {

    public static void FunctioninterfacessExample() {

        int[] arr = {4, 7, 8, 96, 4};
        List<Integer> s = stream(arr).sorted().boxed().toList();
        System.out.println(s);
        String m = "Hel576LoHow";
        char[] z = m.toCharArray();
        ArrayList<Integer> digitsList = new ArrayList<>();
        StringBuilder b = new StringBuilder(" ");
        System.out.println(m);
        System.out.println(Arrays.toString(z));
        for (char v : z) {
            if (Character.isUpperCase(v)) {
                b = b.append(Character.toLowerCase(v));
            } else if (Character.isLowerCase(v)) {
                b = b.append(Character.toUpperCase(v));
            } else {
                digitsList.add(Character.getNumericValue(v));
            }

        }
        System.out.println(b);
        System.out.println(digitsList);
        String[] n = m.split(" ");
        Collections.reverse(Arrays.asList(n));
        System.out.print(Arrays.toString(n));

    }

}
