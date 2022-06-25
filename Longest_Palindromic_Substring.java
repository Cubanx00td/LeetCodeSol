class Solution {
    public int maxlen = 0;
    public int start ,end = 0;
    public String longestPalindrome(String s) {
        
        
        if(s.length()<=1 ){
            return s;
        }
        for(int i = 0; i<s.length(); i++){
            checkPalindrome(s, i, i);
            checkPalindrome(s, i, i+1);
            
        }
        return s.substring(start, end + 1);
    }
    void checkPalindrome(String str, int left, int right){
        while(left>=0 && right<str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        
        
        if(maxlen < right-left-1){
            maxlen = right-left-1;
            System.out.printf("%d %d %d\n", left, right, maxlen);
            start = left + 1;
            end = right - 1;
        }
    }
}
