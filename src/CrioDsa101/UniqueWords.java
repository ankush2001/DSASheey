package CrioDsa101;

import java.util.HashSet;
import java.util.Set;

public class UniqueWords {

    static int countUniqueWords(String[] words) {
        if (words == null || words.length == 0) {
            return 0;
        }
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        return uniqueWords.size();
    }
    public static void main(String[] args) {

        String[] words = {"apple", "banana", "apple", "orange", "banana", "kiwi"};
        int uniqueCount = countUniqueWords(words);
        System.out.println("Number of unique words: " + uniqueCount);
    }
}
