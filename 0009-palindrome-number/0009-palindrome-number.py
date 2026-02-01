class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x< 0:
            return False 
        original = x
        sum =0
        while x >0 :
            num = x%10
            sum = sum *10 + num 
            x = x//10
        return original == sum 