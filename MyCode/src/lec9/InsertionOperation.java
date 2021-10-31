package lec9;
import java.util.*;
import static lec7.ArraySearch.takeInput;
public class InsertionOperation {
    public static void main(String[] args) {
        int[] arr = takeInput();
        insertSortLast(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSortLast(int[] arr)
    {
        int temp = arr[arr.length-1];
        int i = arr.length-2;
        while(i>=0){
            if(arr[i]>temp)
                arr[i+1] = arr[i];
            else
                break;
            i--;
        }
        arr[i+1] = temp;
    }
}
