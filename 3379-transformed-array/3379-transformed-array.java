class Solution {
    public int[] constructTransformedArray(int[] nums) {
        //The trick is: new_position = ((i + nums[i]) % n + n) % n. This handles positive jumps, negative jumps, and even wraps around correctly in all cases.For i=0: ((0 + 3) % 4 + 4) % 4 = (3 + 4) % 4 = 7 % 4 = 3 → result[0] = nums[3] = 1
//For i=1: ((1 + (-2)) % 4 + 4) % 4 = ((-1) % 4 + 4) % 4 = (-1 + 4) % 4 = 3 % 4 = 3 → result[1] = nums[3] = 1
//For i=2: ((2 + 1) % 4 + 4) % 4 = (3 + 4) % 4 = 7 % 4 = 3 → result[2] = nums[3] = 1
//For i=3: ((3 + 1) % 4 + 4) % 4 = (4 % 4 + 4) % 4 = (0 + 4) % 4 = 4 % 4 = 0 → result[3] = nums[0] = 3
        int n = nums.length;
        int [] result = new int[n];
        for(int i=0;i< n;i++){
            result[i] = nums[((i + nums[i])%n +n)%n];

        }
        return result;
    }
}