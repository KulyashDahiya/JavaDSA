package lec1Assignment;

import java.util.Scanner;

public class Largestof5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int [5];
        for(int i = 0; i<5; i++){
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int n = 0;
        while(n<5){
            if(a[n]>max)
                max= a[n];

            n++;
        }
        System.out.println(max);
    }

}
