package lec5Assignment;

import java.util.Scanner;

public class VonNuemanLovesBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(binaryToDecimal(arr[i]) + " ");
        }
    }
    public static int binaryToDecimal(int n)
    {
        int dn = 0, multi = 1;
        while(n!=0)
        {
            int r = n%10;
            dn += multi*r;
            multi *= 2;
            n /= 10;
        }
        return dn;
    }
}
