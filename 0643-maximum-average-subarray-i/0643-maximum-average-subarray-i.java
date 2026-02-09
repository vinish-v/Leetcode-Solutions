class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n= nums.length;
        int firstSum = 0;
        for(int i=0;i<k;i++){
            firstSum += nums[i];
        }
        int maxSum = firstSum;
        for(int i=k ; i<n;i++){
            firstSum+= nums[i];
            firstSum-=nums[i-k];
            maxSum = Math.max(maxSum,firstSum);
        }
        return (double)maxSum/k;
    }
}