import java.util.*;

public class second{
  public static void test() {
    int[] arr = {3, 5, 12, 45, 24, 6576, 4, 3};
    Optional<Integer> secondHighest = Arrays.stream(arr)
            .distinct()               // remove duplicates
            .boxed()                  // int → Integer
            .sorted((a, b) -> b - a)  // descending
            .skip(1)                  // skip highest
            .findFirst();
    System.out.println(secondHighest);
  }

  public static void tests() {
    int[] arr = {3, 2, 6, 4,8,9};
    int highest = 0;
    int secondHighest = 0;
    int thirdhighest = 0;
    for (int num : arr)
    {
      if (num > highest)
      {
        highest = num;
      }
      else if (num < highest && num > secondHighest)
      {
        secondHighest = num;
      }
      else if (num < secondHighest && num > thirdhighest)
      {
      thirdhighest=num;
      }
    }
    System.out.println(highest);
    System.out.println(secondHighest);
    System.out.println(thirdhighest);
  }

}
