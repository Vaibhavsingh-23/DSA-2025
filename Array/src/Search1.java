public class Search1 {
    static int n;
    static int[] arr = new int[]{3, 8, 3, 6, 5, 4, 3, 2, 1, 12};
    public static void main(String[] args) {
        System.out.println(search(3));
    }
    public static int search(int k) {
        n = arr.length - 1;
        while (n >= 0) {
            if (arr[n] == k) {
                return n;
            } else n = n - 1;
        }
        return -1;
    }
}