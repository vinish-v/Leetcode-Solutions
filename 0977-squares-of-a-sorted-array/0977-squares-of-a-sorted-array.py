class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        squared = []
        for i in nums:
            squared.append(i*i);
        squared.sort()
        return squared

        