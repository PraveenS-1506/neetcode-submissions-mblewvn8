class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int pre[] = new int[len];
        int suf[] = new int[len];
        pre[0] = 0;
        suf[len-1] = 0;
        for(int i =0; i<=len-1; i++){
                for(int a =i; a<=len-1; a++){
                    suf[i] = Math.max(suf[i], height[a]);
                }
                for(int a=i; a>=0; a--){
                    pre[i] = Math.max(pre[i], height[a]);
                }
        }

        int water = 0;
        for(int b = 0; b <= len-1; b++){
            int current = Math.min(pre[b], suf[b]) - height[b];
            if(current > 0){
                water += current;
            }
        }

        return water;
    }
}
