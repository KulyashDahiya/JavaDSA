package lec8;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int a)
    {
        int temp = arr[a];
        arr[a] = arr[a+1];
        arr[a+1] = temp;
    }
}
