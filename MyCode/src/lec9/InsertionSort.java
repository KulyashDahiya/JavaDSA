package lec9;
import static lec7.ArraySearch.takeInput;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = takeInput();
        InsertSort(arr);
    }
    public static void InsertSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            insert(arr, i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void insert(int[] arr, int k)
    {
        int temp = arr[k];
        int i = k-1;
        while(i>=0)
        {
            if(arr[i] > temp)
                arr[i+1] = arr[i];
            else
                break;
            i--;
        }
        arr[i+1] = temp;
    }
}
