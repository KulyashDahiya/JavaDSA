package lec5Assignment;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        //sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(ch == "/"){
            division(a,b);
        }
    }
    public static void division(int a, int b)
    {
        int div = a/b;
        System.out.print(div);
        System.out.print(div);
    }
}