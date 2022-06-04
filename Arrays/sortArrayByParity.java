class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int new_arr[] = new int[nums.length];
        int counter=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                new_arr[counter]= nums[i];
                counter++;
            }
        }
        for(int i = 0;i<nums.length;i++){
                if(nums[i]%2==1){
                    new_arr[counter]= nums[i];
                    counter++;
                }
        }
        return new_arr;
    }
}