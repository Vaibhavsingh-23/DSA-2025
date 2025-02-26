//88. Merge Sorted Array

/*You are given two integer arrays numsl and nums2, sorted in non-decreasing order, and
two integers m and n; representing the number of elements in numsl and nums2
respectively.
numsl and nums2 into a single array sorted in non-decreasing order.
Merge
The final sorted array should not be returned by the function, but instead be stored inside
the array numslu To accommodate this, numsl has a length of m + n, where the first m
elements denote the elements that should be merged, and the last n elements are set to
0 and should be ignored. nums2 has a length of n.*/
public class Merge_Sorted_Array88 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int arr[] = new int[m + n];
            int i = 0, j = 0, k = 0;
            while (i < m && j < n) {
                if (nums1[i] < nums2[j]) {
                    arr[k++] = nums1[i++];
                } else {
                    arr[k++] = nums2[j++];
                }
            }
            while (i < m) {
                arr[k++] = nums1[i++];
            }
            while (j < n) {
                arr[k++] = nums2[j++];
            }
            for (int x = 0; x < m + n; x++) {
                nums1[x] = arr[x];
            }
        }
    }
}
