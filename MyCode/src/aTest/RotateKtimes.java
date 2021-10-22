package aTest;

import java.util.Scanner;

public class RotateKtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(rotate(n,k));
    }
    public static int rotate(int n, int k){
        int nod = nod(n);
        int num = n;

        if(k<0)
            k += nod;

        k %= nod;

        for (int i = 0; i <=k ; i++) {
            int rem = num % 10;
            num = rem * (int) Math.pow(10, nod - 1) + num / 10;
        }

        return num;
    }
    public static int nod(int n)
    {
        return (int)Math.log10(n)+1;
    }
}
