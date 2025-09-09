package CrioDSA102.questions;

import java.util.Scanner;

public class incrementNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        int arr[] = new int[number];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
       int ans[] = incrementNumberA(number,arr);
        System.out.println("The numbers in array are : ");
        for(int i=0;i< ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] incrementNumberA(int number, int[] arr) {
        for (int i = number-1 ;i >= 0 ; i--) {
            if(arr[i] == 9){
                arr[i] = 0;
            }else {
                arr[i] = arr[i] + 1;
                return arr;
            }
        }
        int temp[] = new int[number + 1];
        temp[0] = 1;
        return temp;
    }
}
