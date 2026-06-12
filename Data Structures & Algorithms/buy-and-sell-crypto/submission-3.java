class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int maxProfit = 0;
        int n = prices.length;
        for(int l=0; l<n; l++){
            minSoFar = Math.min(minSoFar, prices[l]);
            int profit = prices[l] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}