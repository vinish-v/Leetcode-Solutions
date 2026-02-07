class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left =0;
        int right = n-1;
        int mid = 0;
        while (mid <= right){
            if(nums[mid] == 0){
                swap(nums,left , mid);
                left++;
                mid++;
            }
            else if (nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,right);
                right --;
            }
            else{
                swap(nums,mid,right);
                right--;
            }
        }
    }
// here only there colors so three numbers only 0,1,2.
//so instead of normal way we just swap only these three
    public static void swap( int nums[] ,int i , int j){
        int curr = nums[i];
        nums[i] = nums[j];
        nums[j] = curr;
    }
}