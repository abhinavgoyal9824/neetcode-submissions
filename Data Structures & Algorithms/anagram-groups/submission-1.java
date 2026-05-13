class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        HashMap<String,List<String>> map = new HashMap<>();
        int n = s.length;
        for(int i=0;i<n;i++){
            char[] arr = s[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(map.containsKey(key)){
                map.get(key).add(s[i]);
            }else{
                map.put(key, new ArrayList<String>());
                map.get(key).add(s[i]);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}
