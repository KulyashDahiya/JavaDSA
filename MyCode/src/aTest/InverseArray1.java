package aTest;
import java.util.Scanner;

public class InverseArray1 {
    public static int[] inverse(int[] arr){
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            brr[arr[i]] = i;
        }
        return brr;
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        int[] brr = inverse(arr);
        display(brr);
    }
    public static void display(int[] brr)
    {
        for(int val : brr){
            System.out.print(val + " ");
        }
    }
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
