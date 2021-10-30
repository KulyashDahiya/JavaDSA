package lec5Assignment;

import java.util.Scanner;

public class KejriwalOddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            oe(t);
        }
    }

    public static void oe(int temp) {
        int sumo = 0;
        int sume = 0;
        while (temp != 0) {
            int rem = temp % 10;
            if (rem % 2 == 0)
                sume += rem;
            else
                sumo += rem;
            temp /= 10;
        }
        if (sume % 4 == 0 || sumo % 3 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

