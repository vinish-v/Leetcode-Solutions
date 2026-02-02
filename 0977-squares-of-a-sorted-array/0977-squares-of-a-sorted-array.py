from typing import List

class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        n = len(nums)
        ans = [0] * n     

        left = 0
        right = n - 1
        index_from_last = n - 1

        while left <= right:
            if abs(nums[left]) > abs(nums[right]):
                ans[index_from_last] = nums[left] * nums[left]
                left += 1
            else:
                ans[index_from_last] = nums[right] * nums[right]
                right -= 1

            index_from_last -= 1

        return ans
