class Solution {
    public int findNumbers(int[] nums) {
        int countofEven = 0;
        for(int i = 0; i<nums.length;i++)
            {   
                int count = 0;
                while(nums[i]>0){
                count = count + 1;
                nums[i] = nums[i]/10;
                }
            
            if(count%2==0){
                countofEven = countofEven + 1;
                }
            }
        return countofEven;
    }
}