class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int n : nums1){
            set1.add(n);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int i : nums2){
            set2.add(i);
        }
        Set<Integer> mainSet =new HashSet<>();
        for(Integer var : set1){
            if(set2.contains(var)){
                mainSet.add(var);
            }
        }
        int [] arr = new int [mainSet.size()];
        int j=0;
        for(Integer val : mainSet){
            arr[j] = val.intValue();
            j++;
        }
        return arr;
    }
}