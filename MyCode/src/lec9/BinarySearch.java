package lec9;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(arr, 6));
    }
    public static int binarySearch(int[] arr, int ele){
        int si = 0;
        int ei = arr.length - 1;
        while (si <= ei)
        {
            int mid = si + ((ei-si)/2); 
            if(arr[mid] == ele) {
                return mid;
            }
            else if (arr[mid] > ele) {
                ei = mid - 1;
            }
            else {
                si = mid + 1;
            }
        }
        return -1;
    }
}
