package lec8;
import java.util.Arrays;
import static aTest.InverseArray1.takeInput;
import static aTest.FastRotate1.swap2;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = takeInput();
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void BubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) {
            int c = 0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1])
                {
                    swap2(arr, j, j+1);
                    c++;
                }
            }
            if(c==0){
                break;
            }
        }
    }

}
