
class Solution {
    public int characterReplacement(String s, int k) {
         HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for(int r=0; r<s.length(); r++){
            char cur = s.charAt(r);
            map.put(cur, map.getOrDefault(s.charAt(r), 0)+1);
            maxFreq = Math.max(maxFreq, map.get(cur));

            if((r-l+1) - maxFreq > k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
            }

            maxLen = Math.max(maxLen, r-l+1);
        }

        return maxLen;
        }
    }
