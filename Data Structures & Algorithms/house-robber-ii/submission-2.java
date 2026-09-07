class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int n = nums.length;
        return Math.max(rangeRob(0, n-2, nums),rangeRob(1, n-1, nums));
    }

    public int rangeRob(int start, int end, int[] nums){
        int n = end - start+1;
        int[] dp = new int[n];
        if(n==1){
            return nums[start];
        }
        dp[0] = nums[start];
        dp[1] = Math.max(dp[0], nums[start+1]);
        
        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i+start]);
        }
        return dp[n-1];
    }
}