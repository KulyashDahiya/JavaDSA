package lec7;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr3 = {5, 4, 3, 2, 1};

    }
        public static void swap2(int arr[], int a, int b) {
            int t = a;
            a = b;
            b = t;
        }

        public static void swap4(int arr[], int arr2[]) {
            int t = arr[0];
            arr[0] = arr2[0];
            arr2[0] = t;
        }

}
