package lec5Assignment;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == '/' || ch == '*' || ch == '-' || ch == '+' || ch == '%') {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(operation(ch, a, b));
        } else if (ch == 'X' || ch == 'x') {
            return;
        }
        else
            System.out.println("Invalid operation. Try again");
            main(args);
    }

    public static int operation(char ch, int a, int b) {
        int ans = 0;
        switch (ch) {
            case '/':
                ans = a / b;
                break;
            case '*':
                ans = a * b;
                break;
            case '+':
                ans = a + b;
                break;
            case '-':
                ans = a - b;
                break;
            case '%':
                ans = a % b;
                break;
            default:
                System.out.println("Invalid operation. Try agan");
        }
        return ans;
    }
}