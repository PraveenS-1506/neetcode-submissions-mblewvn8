class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length ==0) return 0;

        int[] nums2 = nums.clone();
        Arrays.sort(nums2);
        int seq =1;
        int max=1;
        int len = nums2.length;
        for(int i=1; i<len;i++){
            if(nums2[i] == nums2[i-1]){
                continue;
            }
            if(nums2[i] == nums2[i-1]+1){
                seq++;
            }
            else{
                seq = 1;
            }
            max = Math.max(max, seq);
        }
        return max;
    }
}