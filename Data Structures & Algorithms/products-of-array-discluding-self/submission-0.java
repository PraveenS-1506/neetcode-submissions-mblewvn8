class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i = nums.length;
        int[] result = new int[i];
        for(int a=0; a<i; a++){
            int res =1;
            for(int b=0; b<a; b++){
                res = res*nums[b];
            }
            for(int c=a+1; c<i; c++){
                res = res*nums[c];
            }
            result[a] = res;   
        }
        return result;
    }
}  

