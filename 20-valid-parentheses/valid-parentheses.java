class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<n; i++){
            char c = s.charAt(i);
            if(c== '(' || c== '{' || c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;
                char topchar = st.pop();
                if((c== ')' && topchar != '(') || (c== '}' && topchar != '{') || c== ']' && topchar!='[') 
                return false;
            }
        }
        return st.isEmpty();
    }
}