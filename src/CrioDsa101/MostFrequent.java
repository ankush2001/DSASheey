package CrioDsa101;

import java.util.HashMap;
import java.util.*;


public class MostFrequent {
/*
if your string was: aaaaAAAA, your output would be: A 4, because A has lower ASCII value than a.
 */
    static Object[] mostFrequent(String s) {
        if (s.length() == 0){
            return new Object[]{null, 0}; // Return null and 0 if the string is empty
          }
        Map<Character, Integer> map = new HashMap<>(); // character -> frequency

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char mostFrequentChar = '\0';
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) { //Map.Entry is used to iterate over the map
            // gives u a key-value pair and map.EntrySet() returns a set of all the entries in the map
            char currentChar = entry.getKey();
            int currentFrequency = entry.getValue();
            if (currentFrequency > maxFrequency ||
                (currentFrequency == maxFrequency && currentChar < mostFrequentChar)) {
                mostFrequentChar = currentChar;
                maxFrequency = currentFrequency;
            }
        }

        return new Object[]{mostFrequentChar, maxFrequency};
    }


    static int findFrequency(String s, char c) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count; // Return the frequency of character c in string s
    }
    static Object[] mostFrequent_1(String s) {
       for (int ascii = 0; ascii < 256; ascii++) {
            int count = findFrequency(s, (char) ascii);
            if (count > 0) {
                return new Object[]{(char) ascii, count}; // Return the first character with its frequency
            }
        }
        return new Object[]{null, 0}; // Return null and 0 if no characters found
    }  //time complexity is O(256*n) and space complexity is O(1)



    public static void main(String[] args) {
        Object[] result = mostFrequent("aaaAAA");
        System.out.println("Most frequent char: " + result[0]);
        System.out.println("Frequency: " + result[1]);
    }

}
