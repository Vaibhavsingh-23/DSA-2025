class Solution {
    public boolean check(int[] nums) {
        int count =0;
        int l=0;
        int m =0;
        if(nums.length==2){
            return true;
        }
        else{
            for(int i =0 ; i<nums.length-1 ;i++)
            {
                if(nums[i]>nums[i+1])
                {
                    ++count;
                    l=i+1;

                }
            }
            if(count==0)
            {
                return true;
            }
            else if(count==1)
            {
                for(int i =0;i<l-1;i++)
                {

                    if(nums[i]<nums[i+1])
                    {

                        ++m;
                        //System.out.println(nums[i+1]);
                    }
                    else
                    {
                       // System.out.println(nums[i+1]);
                        return false;
                    }
                }
                if(m>0){
                    return true;
                }

            }
            else
            {
                return false;
            }
        }
        System.out.println(count+": count");
        return false;
    }
}