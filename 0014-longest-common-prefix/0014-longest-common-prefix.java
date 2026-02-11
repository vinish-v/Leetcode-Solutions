class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int prefixLen = prefix.length();
        if(strs.length ==0 || strs == null) return "";
        //checking all one by one 
        for(int i=1;i<strs.length;i++){
            String currPrefix = strs[i];
            //shirinking the string letter by letter of current string  until it match with prefix
            while(prefix.length() >currPrefix.length() || !prefix.equals(currPrefix.substring(0,prefixLen))){
                prefixLen--;
                //if no prefix matches then it will become 0 so return ""
                if(prefixLen == 0){
                    return "";
                }
                prefix = prefix.substring(0,prefixLen);
            }
        }
        return prefix;
    }
}