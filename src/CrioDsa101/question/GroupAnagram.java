package CrioDsa101;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GroupAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int check = 0;
        String[] strs = new String[n];
        for(int i = 0 ; i < n ;i++) {
            strs[i] = scanner.next();
        }
        List<List<String>> result = new GroupAnagram().groupAnagram(strs);
        for (List<String> strings : result) {
            for (String string : strings) {
                System.out.printf("%s ", string);
            }
            System.out.print("\n");
        }

    }
    public List<List<String>> groupAnagram(String[] strs) {
        HashMap<HashMap<String, Integer>, List<String>> map = new HashMap<>();
        for (String str : strs) {
            HashMap<String, Integer> hashMap = new HashMap<>();
            for (char c : str.toCharArray()) {
                String key = String.valueOf(c);
                hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
            }
            if (!map.containsKey(hashMap)) {
               ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(hashMap, list);
            }
            else {
                map.get(hashMap).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}
