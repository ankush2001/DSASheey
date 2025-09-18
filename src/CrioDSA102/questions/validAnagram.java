package CrioDSA102.questions;

public class validAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram(s, t);
        System.out.println("Is Anagram: " + result);
    }
    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCount = new int[26]; // Assuming only lowercase letters
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            charCount[c - 'a']--;
            if (charCount[c - 'a'] < 0) {
                return false; // More occurrences in t than in s
            }
        }
        return true; // All counts are zero
    }//time complexity O(n) and space complexity O(1)
}
