class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        for(int i =0;i<n;i++){
          output[i]=i;
        }
        int left=1;
        for(int i=0;i<n;i++){
            output[i]*=left;
            left*=nums[i];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }
        return output;
    }
}
