package leetcode27.src;

public class IterativeBS {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int t = 3, s = 0;

        int l = arr.length - 1;
        while (s <= l) {
            int mid = s + (l - s) / 2;
            if (t == arr[mid]) {
                System.out.println(mid);
                return;
            } else if (arr[mid] < t) {
                s = mid + 1;
            } else {
                l = mid - 1;
            }
        }
    }
}
