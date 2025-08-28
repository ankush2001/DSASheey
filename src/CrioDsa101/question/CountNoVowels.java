package CrioDsa101;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNoVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character, Integer> result = countNoVowels(str);
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    private static Map<Character, Integer> countNoVowels(String str) {
        if (str == null || str.isEmpty()) {
            return Map.of(); // Return an empty map if the string is null or empty
        }

        Map<Character, Integer> vowelCount = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                vowelCount.put(ch, vowelCount.getOrDefault(ch, 0) + 1);
            }
        }

        return vowelCount;
    }

    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1; // Check if the character is a vowel
    }
}
