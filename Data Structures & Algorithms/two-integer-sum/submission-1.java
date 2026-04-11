class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int indSum =0;
        for(int i =0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i != j){
                if(nums[i] + nums[j] == target){
                    if(indSum == 0){
                        indSum = i+j;
                        res[0] = i;
                        res[1] = j;
                        return res;
                    }
                    if(indSum>0 && i+j < indSum){
                        indSum = i+j;
                        res[0] = i;
                        res[1] = j;
                        return res;
                    }
                }
            }
            }
        }
        return res;
    }
} 


    

