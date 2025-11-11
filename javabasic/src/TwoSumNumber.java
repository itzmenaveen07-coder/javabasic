import java.util.HashMap;

public class TwoSumNumber {
//    public static void sum() {
//        int[] numbers = {20, 4, 8, 3, 15};
//        int target=23;
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++){
//                if (numbers[i] + numbers[j] == target) {
//                    System.out.println("[" + i + ", " + j + "]");
//                    ;
//                    System.out.println();
//                }
//            }
//
//
//        }
//    }
//}



    public static void Sums()
    {
        {
            int[] numbers = {20, 4, 8, 3, 15};
            int target = 28;

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < numbers.length; i++) {
                int complement = target - numbers[i];
                if (map.containsKey(complement)) {
                    System.out.println("[" + map.get(complement) + ", " + i + "]");
                    // If you want only one pair, you can break here
                    break;
                }
                map.put(numbers[i], i);
            }
        }
    }
}