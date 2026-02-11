class Solution {
    public int lengthOfLastWord(String s) {
        String [] arr = s.trim().split("\\s+");
        int n  = arr.length;
        String last = arr[n-1];
        int wordlen = last.length();
        return wordlen;
    }
}