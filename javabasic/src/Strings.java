import java.util.HashMap;

public class Strings {
    static String reverse = "";

    public static void Returnnonrepeated()
    {
        String a = "swiss";
        char[] b = a.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : b)
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        System.out.println("Non-repeated characters:");
        for (char ch : b)
        {
            if (map.get(ch) == 1)
            {
                System.out.println(ch);
            }
        }

    }

    public static void Reversewithbuilder()
    {
        String a = "swiss";
        StringBuilder b = new StringBuilder(a);
        b.reverse();
        System.out.println(b);
    }

    public static void Reversewithoutstringbuilder()
    {
        String a = "swiss";
        char[] b = a.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = b.length - 1; i >= 0; i--) {
            reverse += b[i];
        }
        System.out.println(reverse);
    }

    public static void palindrome()
    {
        String a = "madam";
        char[] b = a.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = b.length - 1; i >= 0; i--)
        {
            reverse += b[i];
        }
        if (a.equals(reverse))
        {
            System.out.println(a + " is a palindrome");
        } else
            System.out.println(a + " is not a palindrome");

    }

    public static void CountVowelsAndConsonants()
    {

        String a = "aleoidonu";
        int count = 0;
        char[] b = a.toCharArray();
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        for (char ch : b) {
            for (char v : vowel)
            {
                if (ch == v) {
                    count++;
                    break;
                }

            }

        }
        System.out.println("vowels count "  + count);
    }
    public static void Removespaces()
    {
        String a = "Hello Naveen how are you";
       char[] b = a.toCharArray();
        StringBuilder c = new StringBuilder();
        String result = a.replaceAll("\\s+", "");
        for(char ch :b)
        {
            if(ch !=' ' )
            {
                c.append(ch);
            }
        }
        System.out.println(c);
        System.out.println(result);
    }
    public static void stringToInteger(){

        String a= "7558";
        int number=Integer.parseInt(a);
        System.out.println(number);
    }

}