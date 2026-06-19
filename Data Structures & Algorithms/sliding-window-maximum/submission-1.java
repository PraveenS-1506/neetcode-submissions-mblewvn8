class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 1){
            return nums;
        }
        int resSize = nums.length + 1 - k;
        int result[] = new int[resSize];
        int l = 0;
        int r = k-1;
        int curMax = 0;

        while(r<nums.length){
            for (int a =0; a< resSize; a++){
                for (int i=l; i<=r; i++){
                    curMax = Math.max(curMax, nums[i]);
                }
                result[a] = curMax;
                curMax = 0;
                l++;
                r++;
            }
        }


        return result;
    }
}