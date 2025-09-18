package CrioDSA102.questions;

public class isPermutationPalindrome {
    public static void main(String[] args) {
        String s = "civic";
        int result = canPermutePalindrome(s);
        System.out.println("Can the string be permuted to form a palindrome? " + result);
    }

    private static int canPermutePalindrome(String s) {
        int[] charCount = new int[128]; // Assuming ASCII
        for (char c : s.toCharArray()) {
            charCount[c]++;
        }
        int oddCount = 0;
        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) {
                return 0; // More than one character has an odd count
            }
        }
        return 1; // Can be permuted to form a palindrome
    }
}
