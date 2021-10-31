package aTest;
import java.util.Arrays;
import static aTest.InverseArray1.takeInput;
public class FastRotate1 {
    public static void main(String[] args) {
        int[] arr = takeInput();
        fastRotate(arr, 103);
    }
    public static void fastRotate(int[] arr, int k){
        k %= arr.length;
        if(k<0){
            k += arr.length;
        }
        reverse(arr, 0 , arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap2(arr, i, j);
            i++;
            j--;
        }
    }
    public static void swap2(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
