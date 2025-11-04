import java.util.HashMap;
import java.util.Map;

public class uniqueCharCount {
    public static int countUniqueCharacters(String s) {
        // Create a HashMap to store frequency of each character
        Map<Character, Integer> freq = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Count characters that appeared exactly once
        int count = 0;
        for (int val : freq.values()) {
            if (val == 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Count of characters that appeared only once: " + countUniqueCharacters(input));
    }
}
