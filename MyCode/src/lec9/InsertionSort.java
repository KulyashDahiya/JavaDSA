package lec9;
import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortInsert(arr);
    }
    public static void insert(int[] arr, int k)
    {
        int temp = arr[k];
        int i = arr[k-1];
        while(i>=0)
        {
            if(arr[i]>temp)
            {
                arr[i+1] = arr[i];
            }
            else{
                break;
            }
            i--;
        }
        arr[i+1] = temp;
    }
    public static void sortInsert(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            insert(arr, i);
        }
    }
}
