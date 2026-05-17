class Solution {
    public boolean isPalindrome(String s) {
        String k = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((c>='A' && c<='Z')||(c>='a' && c<='z') || (c>='0' && c<='9')){
                k+=c;
            }
        }
        String d = k.toLowerCase();
        for(int i=0;i<d.length()/2;i++){
            if(d.charAt(i)!=d.charAt(d.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
