class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        ArrayList<Character> a = new ArrayList<>();
        ArrayList<Character> b = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            a.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            b.add(t.charAt(i));
        }
        Collections.sort(a);
        Collections.sort(b);
        for(int i=0;i<s.length();i++){
            if(a.get(i)!=b.get(i)){
                return false;
            }
        }
        return true;
    }
}
