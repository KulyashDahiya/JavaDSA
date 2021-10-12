package lec5;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printArmstrong(a, b);
    }
    public static void printArmstrong(int start, int end){
        for(int i = start; i <= end; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    public static int nod(int n){
        return (int) Math.log10(n) + 1;
    }
    public static boolean isArmstrong(int n){
        int nod = nod(n);
        int nn = 0;
        int temp = n;
        while (n!=0){
            int rem = n%10;
            nn += (int) Math.pow(rem, nod);
            n /= 10;
        }
        if (temp==nn){
            return true;
        }
        else {
            return false;
        }
    }
}
