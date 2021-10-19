package lec8;
import java.util.Arrays;
public class RotateArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate(arr, 3);
    }
    public static void rotate(int[] arr, int k)
    {
        k %= arr.length;
        if(k<0){
            k += arr.length;
        }
        for (int j = 1; j < =k; j++) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
