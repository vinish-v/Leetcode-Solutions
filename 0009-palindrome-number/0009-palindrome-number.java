class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if(x <0){
            return false;
        }
        int original = x;
        int sum =0;
        while (x!=0){
            int num = x%10;
            sum = sum *10 +num;
            x = x/10;
        }
        return original == sum;
    }
}