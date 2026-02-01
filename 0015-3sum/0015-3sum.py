class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result =[]
        nums.sort()
        n = len(nums)
        for i in range(n):
            if i>0 and nums[i] == nums[i-1]:
                continue
            low = i+1
            high = n-1
            while low < high:
                sum = nums[i] +nums[low] + nums[high]
                if sum > 0:
                    high -=1
                elif sum <0 :
                    low+=1
                elif sum ==0:
                    result.append([nums[i],nums[low],nums[high]])
                    low+=1
                    while nums[low] == nums[low-1] and low<high:
                        low+=1
        return result


        