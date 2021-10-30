package lec8;
import java.util.Scanner;
import static lec8.InverseArray1.takeInput;
import static lec8.InverseArray1.display;

public class RotateArrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = takeInput();
        int k = sc.nextInt();
        rotateArr(arr,k);
        display(arr);

    }
    public static void rotateArr(int[] arr, int k)
    {
        for(int i = 0; i < k; i++)
        {
            int temp = arr[arr.length-1];
            for (int j = arr.length-2; j >=0 ; j--) {
                arr[j+1] = arr[j];
            }
            arr[0] = temp;
        }
    }
}