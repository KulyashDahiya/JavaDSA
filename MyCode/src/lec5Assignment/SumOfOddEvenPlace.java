package lec5Assignment;
import java.util.Scanner;
public class SumOfOddEvenPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumo = 0, sume = 0, i = 0;
        while(n!=0) {
            int r = n % 10;
            if (i % 2 == 0) {
                sumo += r;
            } else {
                sume += r;
            }
            i++;
            n /= 10;
        }
        System.out.println(sumo);
        System.out.println(sume);
    }
}
