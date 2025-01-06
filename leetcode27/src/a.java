public class a {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums ={0,1,2,2,3,4,0,2};
        s.removeElement(nums, 2);
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int num: nums){
            if(num==val)    k++;
        }

        int last= nums.length-1;
        for(int i=0; i<nums.length-k; i++){
            if(nums[i]==val){
                while(nums[last]==val)  last--;
                int temp= nums[i];
                nums[i]= nums[last];
                nums[last--]= temp;
            }
        }

        for(int num: nums){
            System.out.print(num+" ");
        }
        return k;
    }
}
