package aTest;
import java.util.Arrays;

import static aTest.InverseArray1.takeInput;
import static aTest.FastRotate1.swap2;
public class SelectionSort1 {
    public static void main(String[] args) {
        int[] arr = takeInput();
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            int j = min(arr, i, min);
            swap2(arr,i, j);
        }
    }
    public static int min(int[] arr, int i, int min)
    {
        for (int j = i+1; j < arr.length; j++) {
            if(arr[j]<arr[min]){
                min = j;
            }
        }
        return min;
    }
}
