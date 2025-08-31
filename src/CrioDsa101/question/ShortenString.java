package CrioDsa101.question;

import java.util.Scanner;

public class ShortenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = stringShorten_1(s);
        System.out.println(ans);
    }

    private static String stringShorten(String s) {
        String ans = "";
        int count = 1;
        for (int i = 1; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if(s.charAt(i-1) != ch){
               ans = ans+ s.charAt(i-1) + count;
               count = 1;
            }
            else{
                count++;
            }
        }
        ans = ans + s.charAt(s.length()-1) + count;
        System.out.println(s.length() + "" + ans.length());
        if (ans.length() >= s.length()) {
            return s;
        }

        return ans;
    }


    private static String stringShorten_1(String s) {
        StringBuilder ans = new  StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if(s.charAt(i-1) != ch){
                ans.append(s.charAt(i-1)).append(count);
                count = 1;
            }
            else{
                count++;
            }
        }
        ans.append(s.charAt(s.length()-1)).append(count);
        String ans2 = ans.toString();
        System.out.println(s.length() + " " + ans2.length());
        if (ans2.length() >= s.length()) {
            return s;
        }
        return ans2;
    }
}
