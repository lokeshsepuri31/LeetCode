package basichashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {

    public static Map<Integer, Integer> getFrequency(int[] arr) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i : arr) {
            if (frequency.containsKey(i)) {
                frequency.put(i, frequency.get(i) + 1);
            } else {
                frequency.put(i, 1);
            }
        }
        return frequency;
    }

    public static void getHighestLowestFrequency(int[] arr) {

        int highestKey = 0;
        int highestValue = 0;
        int lowestKey = 100;
        int lowestValue = 10;

        for (Map.Entry<Integer, Integer> map : getFrequency(arr).entrySet()) {
            int value = map.getValue();
            int key = map.getKey();
            if (highestValue < value) {
                highestValue = value;
                highestKey = key;
            }
            if (lowestValue > value) {
                lowestValue = value;
                lowestKey = key;
            }
        }
        System.out.println("The highest frequency key is: " + highestKey + " -> " + highestValue + ". The lowest frequency key is: " + lowestKey + " -> " + lowestValue);
    }

    public static int getFrequency(int[] arr, int number) {
        return getFrequency(arr).get(number);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 6, 3, 3, 5, 8, 5, 5, 1, 2, 3, 5, 5, 6, 5, 6, 5, 6};
//        System.out.println(getFrequency(arr, 5));
        getHighestLowestFrequency(arr);
    }
}
