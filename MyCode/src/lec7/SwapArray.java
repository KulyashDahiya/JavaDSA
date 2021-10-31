package lec7;
import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = takeInput();
        reverse(arr);
        display(arr);

    }
    public static void reverse(int[] arr)
    {
        int l = arr.length-1, i = 0;
        while(i<l){
            swap5(arr, i, l);
            i++;
            l--;
        }
    }
    public static void swap5(int arr[], int i, int l) {
        int temp = arr[i];
        arr[i] = arr[l];
        arr[l] = temp;
    }
    public static void display(int[] arr)
    {
        for(int a : arr)
        {
            System.out.print(a+ " ");
        }
    }
    public static int [] takeInput()
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
}
