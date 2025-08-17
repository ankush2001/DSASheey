package CrioDsa101;

public class ReverseNumber {
    public static void main(String[] args) {
        int input = 321;
        int output = reverseNum(input);
        System.out.println(output);
    }

    private static int reverseNum(int input) {
        if (input < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        int result = 0;
        while(input !=0){
            int num =  input%10;
            result = result * 10 + num;
            input/=10;
        }
        return result;
    }
}
