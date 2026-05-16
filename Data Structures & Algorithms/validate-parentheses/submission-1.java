class Solution {
    public boolean isValid(String k) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<k.length();i++){
            char c = k.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                s.push(c);
            }else if(!s.isEmpty() && c==')' && s.peek()=='('){
                s.pop();
            }else if(!s.isEmpty() && c==']' && s.peek()=='['){
                s.pop();
            }else if(!s.isEmpty() && c=='}' && s.peek()=='{'){
                s.pop();
            }else{
                s.push(c);
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
