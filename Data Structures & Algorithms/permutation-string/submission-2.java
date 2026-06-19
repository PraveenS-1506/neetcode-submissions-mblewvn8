class Solution {
    public boolean checkInclusion(String s1, String s2) {
        boolean isPermutation = false;
        int l=0; 
        int r=0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i),0)+1);
        }
        while(r<s2.length()){
            map2.put(s2.charAt(r),map2.getOrDefault(s2.charAt(r), 0)+1);
            if(r-l+1<s1.length()){
                r++;
            }
            else if(r-l+1 >=s1.length()){
                if(map1.equals(map2)){
                    return true;
                }
                else{
                    char leftChar = s2.charAt(l);
                map2.put(leftChar, map2.get(leftChar)-1);
                if(map2.get(leftChar) == 0){
                    map2.remove(leftChar);
                }
                l++;
                r++;
                }
            }
        }

        return isPermutation;
    }
}
