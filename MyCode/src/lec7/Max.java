package lec7;

import java.util.Scanner;


    public class Max {
        public static void main(String[] args) {
            int[] arr = takeInput();
            Scanner sc = new Scanner(System.in);
            int m = maxi(arr);
            System.out.println(m);
        }

        public static int[] takeInput() {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            return arr;
        }

        public static int maxi(int[] arr) {
            int m = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > m) {
                    m = arr[i];
                }
            }
            return m;
        }
    }
