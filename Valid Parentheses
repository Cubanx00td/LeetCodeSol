class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length() == 0 && s.length()%2 !=0){
            return false;
        }
        else{
            for (int i = 0; i<s.length(); i++){
                char c = s.charAt(i);
                if(st.isEmpty()){
                    st.push(c);
                }
                else if(c == ')' && st.peek() == '(' || c == '}' && st.peek() == '{' || c == ']' && st.peek() == '['){
                    st.pop();
                }
                else {
                    st.push(c);
                }
            }  
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}
