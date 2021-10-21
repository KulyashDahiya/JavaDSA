package lec9;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSortedly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insert(arr);
    }
    public static void insert(int[] arr)
    {
        int temp = arr[arr.length-1];
        int i = arr.length-2;
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
        System.out.println(Arrays.toString(arr));
    }
}
