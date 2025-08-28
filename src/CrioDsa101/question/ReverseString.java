package CrioDsa101;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ABCBC";
        String output = reverseStr(str);
        System.out.println(output);
    }

    private static String reverseStr(String str) {
        if(str == null || str.length() == 0){
            return str;
        }
        char[] arr = str.toCharArray();
        int len = arr.length;
        int left = 0;
        int right = len - 1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return String.valueOf(arr);
    }//time complexity O(n), space complexity O(n) for the char array,
    // O(1) if we consider the output string as a separate entity

    //alternative solution using StringBuilder
    private static String reverseStr2(String str) {
        if(str == null || str.length() == 0){
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
        //time complexity O(n), space complexity O(n) for the StringBuilder
        // O(1) if we consider the output string as a separate entity
    }
}
