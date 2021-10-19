package lec8;
import java.util.Arrays;
import java.util.Scanner;
public class InverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int[] brr = new int[n];
        for (int i = 0; i < n; i++) {
            brr[arr[i]] = i;
        }
//        for(int val : brr){
//            System.out.print(val + " ");
//        }
        System.out.println(Arrays.toString(brr));
    }
}
