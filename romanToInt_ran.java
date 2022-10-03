class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new LinkedHashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
       List keys = new ArrayList(map.keySet());
        
        int intResult = 0;
        for (int i=0; i< s.length(); i++) {
            char c= s.charAt(i);
            int value = map.get(c);
            
            if ((i+1) < s.length()) {
                int index = keys.indexOf(c);
                int nextIndex = keys.indexOf(s.charAt(i+1));
                
                if(index < nextIndex) {
                    value *= (-1);
                }
            }
            intResult += value;
        }
        
        return intResult;
    }
}
