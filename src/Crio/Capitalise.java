package Crio;

public class Capitalise {
    /**
     * This method capitalises the first letter of a given string.
     * If the string is empty, it returns an empty string.
     *
     * @param str the input string
     * @return the string with the first letter capitalised
     */
    static String capitaliseFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Return the original string if it's null or empty
        }
        // Convert the string to a character array for manipulation
        // This allows us to modify individual characters easily
       char[] arr = str.toCharArray();
        // Iterate through the character array
        // Capitalise the first letter and the letter after each space
        // We check if the character is lowercase and then convert it to uppercase
        // We also handle the case where there are multiple spaces
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0 || arr[i-1] == ' ' && Character.isLowerCase(arr[i]) ) {
                arr[i] = Character.toUpperCase(arr[i]); // Capitalise the first letter
//            } else if (arr[i] == ' ' && i + 1 < arr.length && Character.isLowerCase(arr[i + 1])) {
//                arr[i + 1] = Character.toUpperCase(arr[i + 1]); // Capitalise the letter after space
//            }
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "  the quick Brown fox jumps over The lazy dog.";
        String capitalisedStr = capitaliseFirstLetter(str);
        System.out.println(capitalisedStr
                + " | " +str.length()); // Output: Hello world
    }
}
