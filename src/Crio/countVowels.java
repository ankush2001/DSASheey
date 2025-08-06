package Crio;

public class countVowels {
//    static int countVowels(String str) {
//        //time complexity: O(n)
//        //space complexity: O(1)
//        if (str == null || str.isEmpty()) {
//            return 0; // Return 0 if the string is null or empty
//        }
//        int n = str.length();
//        char[] arr = str.toCharArray();
//
//        int count = 0 ;
//        for(int i=0 ; i < n ; i++){
//            char ch = Character.toLowerCase(arr[i]);
//            if(ch == 'a' || ch == 'e'|| ch == 'i'||
//                    ch == 'o'|| ch == 'u') count++;
//        }
//        return count;
//    }
    //second approach
    static int countVowels(String str) {
        //time complexity: O(n)
        //space complexity: O(1)
        if (str == null || str.isEmpty()) {
            return 0; // Return 0 if the string is null or empty
        }
        int count = 0;
        for (char ch : str.toCharArray()) {
            switch (Character.toLowerCase(ch)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        int vowelCount = countVowels(str);
        System.out.println("Number of vowels in the string: " + vowelCount); // Output: 3
    }
}
