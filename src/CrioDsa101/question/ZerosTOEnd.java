package CrioDsa101;

import java.util.Scanner;
import java.util.Vector;

public class ZerosTOEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Integer> vec = new Vector<Integer>();
        for (int i = 0; i < n; i++){
            vec.add(sc.nextInt());
        }
        Vector<Integer> res = moveZeroes(vec);
        for(Integer elem : res)
            System.out.print(elem+" ");
    }

    private static Vector<Integer> moveZeroes(Vector<Integer> vec){
        int pos = 0;
        int n = vec.size();

        for (int i = 0; i < n; i++) {
            if (vec.get(i) != 0) {
                vec.set(pos, vec.get(i));
                if (pos != i) {
                    vec.set(i, 0);
                }
                pos++;
            }
        }
        return vec;
    }
}
