class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l=0;
        int r=0;
        int n = s.length();
        int maxSize=0;
        int curSize=0;
        if(n<=1){
            return n;
        }
        while(r<n){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                curSize = set.size();
                maxSize = Math.max(maxSize, curSize);
                r++;
            }
            else{
                maxSize = Math.max(maxSize, curSize);
                set.remove(s.charAt(l));
                l++;
            }
        }
        return maxSize;
    }
}
