package leetcode27.src;

public class BS {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int l = arr.length-1;
        int t= 31;
        int s = 0;
        bs(arr, t , s, l);
    }

    public static void bs(int arr[] , int t, int s, int l){
        int mid = (s+l)/2;
        if (s<=l) {
            if (arr[mid] == t) {
                System.out.println(mid);

            } else if (arr[mid] < t) {
                bs(arr,t, mid + 1, l );
            } else if (arr[mid] > t) {
                bs(arr,t, s, mid - 1);
            }
        }else System.out.println("not found");


    }
}
