package lec5Assignment;

import java.util.Scanner;

public class ReplaceThemAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n != 0) {
            long sum = 0, t = 1;
            while (n != 0) {
                int r = (int) (n % 10);
                if (r != 0)
                    sum += r * t;
                else
                    sum += 5 * t;
                t *= 10;
                n /= 10;
            }
            System.out.println(sum);
        }

    }
}
