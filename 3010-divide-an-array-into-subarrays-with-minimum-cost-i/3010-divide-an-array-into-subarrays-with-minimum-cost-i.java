class Solution {
    public int minimumCost(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        //give the min1 and min 2 with the largest values like 2147483647 something
        for(int i =1 ; i<nums.length;i++){
            if(nums[i]<min1){
                min2=min1;
                min1 = nums[i];
            }
            else if (nums[i]<min2){
                min2 = nums[i];
            }

        }
        return nums[0]+min1 + min2;
    }
}