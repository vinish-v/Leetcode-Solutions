class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        #Frequency array for 26 lowercase letters
        charcount = [0]*26
        for i in s:
            charcount[ord(i) - ord('a')]+=1
        for j in t:
            charcount[ord(j) - ord('a')]-=1
        for count in charcount:
            if count !=0:
                return False
        return True
