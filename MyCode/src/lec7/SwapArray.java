package lec7;
import static lec7.ArraySearch.takeInput;
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
}
