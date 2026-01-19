import java.util.HashMap;
import java.util.Map;

public class Strings {


    public static void Returnnonrepeated() {
        String a = "swiss";
        char[] b = a.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : b) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        System.out.println("Non-repeated characters:");
        for (char ch : b) {
            if (map.get(ch) == 1) {
                System.out.println(ch);
            }
        }

    }

    public static void Reversewithbuilder() {
        String a = "swiss";
        StringBuilder b = new StringBuilder(a);
        b.reverse();
        System.out.println(b);
    }

    public static void Reversewithoutstringbuilder() {
        String a = "swiss";
        char[] b = a.toCharArray();
        String reverse = "";
        for (int i = b.length - 1; i >= 0; i--) {
            reverse += b[i];
        }
        System.out.println(reverse);
    }

    public static void palindrome() {
        String a = "madam";
        StringBuilder b = new StringBuilder(a);
        String reverse = b.reverse().toString();
        if (a.equals(reverse)) {
            System.out.println(a + " is a palindrome");
        } else
            System.out.println(a + " is not a palindrome");

    }

    public static void palindrome1() {
        String a = "madam";
        char[] b = a.toCharArray();
        String reverse = "";
        for (int i = b.length - 1; i >= 0; i--) {
            reverse += b[i];
        }
        if (a.equals(reverse)) {
            System.out.println(a + " is a palindrome");
        } else
            System.out.println(a + " is not a palindrome");

    }

    public static void countVowelsAndConsonants() {

        String a = "naveen";
        int vowels = 0;
        int consonants = 0;

        for (char ch : a.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Vowels count: " + vowels);
        System.out.println("Consonants count: " + consonants);
    }

    public static void Removespaces() {
        String a = "Hello Naveen how are you";
        char[] b = a.toCharArray();
        StringBuilder c = new StringBuilder();
        String result = a.replaceAll("\\s+", "");
        for (char ch : b) {
            if (ch != ' ') {
                c.append(ch);
            }
        }
        System.out.println(c);
        System.out.println(result);
    }

    public static void stringToInteger() {

        String a = "7558";
        int number = Integer.parseInt(a);
        System.out.println(number);
    }

    public static void CountVowelsAndConsonants(String str) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Vowels", 0);
        map.put("Consonants", 0);

        str = str.toLowerCase();
        char[] b = str.toCharArray();
        for (char ch : b) {

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {

                    map.put("Vowels", map.get("Vowels") + 1);

                } else {
                    map.put("Consonants", map.get("Consonants") + 1);
                }
            }
        }

        System.out.println("Vowels : " + map.get("Vowels"));
        System.out.println("Consonants : " + map.get("Consonants"));
    }

    public static void parantheses() {
        String a = "((())";
        char[] b = a.toCharArray();
        int count1=0;
        int count2= 0;
        for (char s : b){
            if (s == '('){
                count1= count1 + 1;
            }
            else {
                count2 = count2 + 1;
            }
        }
        if( count1 == count2) {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}