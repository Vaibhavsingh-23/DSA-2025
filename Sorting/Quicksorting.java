class Quicksorting {
    public static void main(String[] args) {
        int[] arr = {8,8,8,8,8,8,8,8};
        int l = arr.length - 1;
        int s = 0;
        sort(arr, s, l);
        printNewArray(arr);
    }
    public static void sort(int[] arr, int s, int l) {
        if (s < l) {
            int j = partition(arr, s, l);
            sort(arr, s, j - 1);
            sort(arr, j + 1, l);
        }
    }
    public static int partition(int[] arr, int s, int l) {
        int pivot = arr[s];
        int i = s;
        int j = l + 1;
        while (i < j) {
            do {
                i++;
            } while (i <= l && arr[i] <= pivot);

            do {
                j--;
            } while (j >= s && arr[j] > pivot);

            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, s, j);
        return j;
    }
    public static void swap(int arr[], int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
    public static void printNewArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
