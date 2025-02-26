public class Twosum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map <Integer ,Integer> mp = new HashMap<>();
            for(int i =0;i<nums.length;i++){

                int nt = target - nums[i];
                if(mp.containsKey(nt)){
                    return new int[]{i,mp.get(nt)};
                }
                mp.put(nums[i],i);
            }
            return null;

        }
    }
}
