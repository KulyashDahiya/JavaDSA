package lec1Assignment;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int t1 = 0, t2 = 1, nextTerm;

        for(int i = 0; i<=N; i++){
            if(t1<=N){
                System.out.println(t1);
            }
            else{
                break;
            }
            nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }
    }

}
