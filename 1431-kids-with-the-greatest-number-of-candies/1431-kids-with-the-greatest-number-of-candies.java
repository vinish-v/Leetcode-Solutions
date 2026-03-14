class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> res = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max, candies[i]);
        }

        for(int i =0;i<n;i++){
            int sumCandies = extraCandies + candies[i];
            res.add(sumCandies >= max);
            
        }
        return res;
    }
}