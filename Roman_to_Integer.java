class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        char [] ch = s.toCharArray();
        int count = 0;
        for(int i = 0; i<ch.length; i++){
            if(i+1 < ch.length && (map.get(ch[i])<map.get(ch[i+1]))){
                count += map.get(ch[i+1]) - map.get(ch[i]);
                i+=1;
            }
            else{
                count += map.get(ch[i]);
            }
        }
        return count;
    }
}
