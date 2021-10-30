package aTest;
import java.util.Arrays;
import java.util.Scanner;

import static aTest.InverseArray1.takeInput;
import static aTest.InverseArray1.display;

public class RotateArrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = takeInput();
        int k = sc.nextInt();
        rotateArr(arr,k);
//        display(arr);

    }
    public static void rotateArr(int[] arr, int k)
    {
        k %= arr.length;
        if(k<0){
            k += arr.length;
        }
        for(int i = 0; i < k; i++)
        {
            int temp = arr[arr.length-1];
            for (int j = arr.length-2; j >=0 ; j--) {
                arr[j+1] = arr[j];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
