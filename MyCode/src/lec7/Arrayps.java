package lec7;

import java.util.Scanner;

public class Arrayps {
    public static void main(String[] args) {
        int[] arr = takeInput();
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int e = search(arr, element);
        System.out.println(e);
    }
    public static int [] takeInput()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int search(int[] arr, int a)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == a){
                return i;
            }
        }
        return -1;
    }
}
