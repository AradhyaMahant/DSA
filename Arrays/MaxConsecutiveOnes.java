class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int numberofones = 0;
        
        for(int i=0 ; i<nums.length;i++)
            {
                if (nums[i] == 1)
                    {
                    numberofones +=1;
                    max = Math.max(max,numberofones);
                    }
                    else{
                        numberofones = 0;
                    }
        }
        return max;
    }
}