class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;
        for(int l=0; l<n-1; l++){
            for(int r=l+1; r<n; r++){
                if(prices[r] > prices[l]){
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        }
        return maxProfit;
    }
}