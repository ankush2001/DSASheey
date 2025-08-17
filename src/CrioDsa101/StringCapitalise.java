package CrioDsa101;



public class StringCapitalise {
    public static void main(String[] args) {
        String str = "  the quick Brown fox jumps over The lazy dog.";
        String capitalisedStr = capitaliseString(str);
        System.out.println(capitalisedStr); // Output: Hello world
    }

    private static String capitaliseString(String str) {
//        if(str == null || str.isEmpty()) {
//            return str; // Return the original string if it's null or empty
//        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a lowercase letter
            if(ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }//time complexity O(n), space complexity O(n) for the StringBuilder

    // Alternative solution using String.toUpperCase()
    private static String capitaliseString2(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Return the original string if it's null or empty
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                ch = Character.toUpperCase(ch);
            }
            sb.append(ch);
        }
        return sb.toString();
    }// time complexity O(n), space complexity O(n) for the StringBuilder

}
