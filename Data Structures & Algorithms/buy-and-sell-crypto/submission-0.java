class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;
        for(int l=0; l<n-1; l++){
            for(int r=l+1; r<n; r++){
                int profit = prices[r] - prices[l];
                if(profit < 1){
                    continue;
                }
                else{
                    maxProfit = Math.max(maxProfit, profit);
                }
            }
        }
        return maxProfit;
    }
}