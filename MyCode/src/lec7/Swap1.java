package lec7;

import java.util.Scanner;

public class Swap1 {
    public static void main(String[] args) {
        int[] arr = takeInput();
        display(arr);
        System.out.println();
        swap(arr);
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
    public static void swap(int[] arr){
        int l = arr.length;
        for (int i = 0; i < arr.length/2; i++) {
            int t = arr[i];
            arr[i] = arr[l-1];
            arr[l-1] = t;
            l--;
        }
    }
    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
