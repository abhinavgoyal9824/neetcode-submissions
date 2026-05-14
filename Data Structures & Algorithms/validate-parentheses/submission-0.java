class Solution {
    public boolean isValid(String k) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<k.length();i++){
            char c = k.charAt(i);
            if(s.isEmpty()){
                s.push(c);
            }else{
            if(s.peek()=='[' && c==']'){
                s.pop();
            }else if(s.peek()=='(' && c==')'){
                s.pop();
            }else if(s.peek()=='{' && c=='}'){
                s.pop();
            }else{
                s.push(c);
            }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
