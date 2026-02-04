class Solution {
    public boolean isTrionic(int[] nums) {

        int n = nums.length;
        if (n<4) return false;
        int i=1;
        while (i<n && nums[i] > nums[i-1]){
            i++;
        }
        int p=i-1;
        while(i < n && nums[i]<nums[i-1]){
            i++;
        }
        int q =i-1;
        while (i<n && nums[i] > nums[i-1]){
            i++;
        }
        int flag =  i-1;

        return(p!=0)&&(q!=p)&&(flag == n-1) &&(flag!=q);

       
        
    }
}