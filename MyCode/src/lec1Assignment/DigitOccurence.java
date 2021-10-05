package lec1Assignment;

import java.util.Scanner;

public class DigitOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        while(N>0)
        {
            int dig = N%10;
            if(dig==n){
                count++;
            }
            N = N/10;
        }
        System.out.println(count);
    }
}
