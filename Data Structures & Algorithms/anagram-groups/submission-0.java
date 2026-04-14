class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map <String , List<String>> map = new HashMap<>();

        for( String s:strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(s);
         }
    List<List<String>> list = new ArrayList<>();
    for(List<String> values : map.values()){
                list.add(values);            
    }
    return list;
}
}