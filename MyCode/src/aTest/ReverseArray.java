package aTest;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = takeInput();
        display(arr);
        System.out.println();
        reverse(arr);
        display(arr);
    }
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void reverse(int[] arr){
        int l = arr.length - 1;
        int i = 0;
        while (i<l){
            int t = arr[i];
            arr[i] = arr[l];
            arr[l] = t;
            i++;
            l--;
        }
    }
    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
