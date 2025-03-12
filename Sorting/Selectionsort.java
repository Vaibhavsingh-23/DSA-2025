public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 8, 7, 4, 5, 6, 9, 10};

        int min = 0;
        for (int i = 0; i < arr.length-1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            swaps(arr, i, min);
        }


        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void swaps(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


