package lec5;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        PrintPrimes(a, b);

    }
    public  static void PrintPrimes(int start, int end){
        for(int i = start; i<= end; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int N){
        for(int i = 2; i<=(int)Math.sqrt(N); i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
}
