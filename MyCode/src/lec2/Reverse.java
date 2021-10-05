package lec2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, org = n;
        while(n!=0){
            int temp = n%10;
            sum = sum*10 + temp;
            n /= 10;
        }
        System.out.println("Reverse: " + sum);
        if(org==sum){
            System.out.println("Palindrome");
        }
    }
}
