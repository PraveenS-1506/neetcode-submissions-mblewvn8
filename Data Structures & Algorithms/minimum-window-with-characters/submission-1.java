class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        String result = "";
        int l = 0;
        int r = 0;
        int need = 0;
        int have = 0;
        int finLen = Integer.MAX_VALUE;
        int curLen;

        HashMap<Character, Integer> mapT = new HashMap<>();
        HashMap<Character, Integer> mapCheck = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i),0)+1);
        }
        need = mapT.size();

        while(r<s.length()){
            mapCheck.put(s.charAt(r), mapCheck.getOrDefault(s.charAt(r),0)+1);
            if(mapT.containsKey(s.charAt(r)) && mapT.get(s.charAt(r)) == mapCheck.get(s.charAt(r))){
                have++;
            }
            
            while(have == need){
                curLen = r-l+1;
                if(curLen < finLen){
                    result = s.substring(l, r+1);
                }
                finLen = Math.min(finLen, curLen);

            char leftChar = s.charAt(l);
            mapCheck.put(leftChar, mapCheck.get(leftChar)-1);
            if(mapCheck.get(leftChar) == 0){
                mapCheck.remove(leftChar);
            }
            l++;
            if(mapCheck.getOrDefault(leftChar, 0) < mapT.getOrDefault(leftChar, 0)){
                 have--;
            }
            }
            r++;
        }

        return result;
    }
}
