public class Twosumsorted {
    public int[] twoSum(int[] numbers, int target) {
        int i =0,j=numbers.length-1;
        while(j>0){
            if(numbers[i]+numbers[j]==target){
                return new int[]{i+1,j+1};
            }
            else if(numbers[i]+numbers[j]>target)
            { j--;;}
            else if(numbers[i]+numbers[j]<target)
            { i++;}

        }
        return null;
    }
}

