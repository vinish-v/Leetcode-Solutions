class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left =0;
        int right = n-1;
        int maxlen =0;
        while(left < right){
            int width = right -left;
            maxlen = Math.max(maxlen, (width) * Math.min(height[left], height[right]));
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
            
        } 
        return maxlen;
    }
}
/*
import java.util.*;

class Solution {
    public int secondMaxSquare(int[] nums) {
        // Step 1 & 2: remove duplicates using Set
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Convert back to list
        List<Integer> list = new ArrayList<>(set);

        // Step 3: sort
        Collections.sort(list);

        // Edge case: need at least 2 distinct elements
        if (list.size() < 2) {
            return -1; // or throw exception
        }

        int secondMax = list.get(list.size() - 2);

        // Step 4: square and return
        return secondMax * secondMax;
    }
}
*/

