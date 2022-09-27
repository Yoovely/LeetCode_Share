import java.util.HashMap;
import java.util.Map;
class Solution {
    public int romanToInt(String s) {

        // 로마 문자에 해당하는 값을 해시맵 통해 매칭
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for(int i=0; i<s.length(); i++){
            if(i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
            }
            else{
                result += map.get(s.charAt(i));
            }
            
        }

        return result;
    
        // 흠.. 그런데 이 코드는 "MCMXCIV" input했을 때 마이너스 값 처리가 안되는 듯.. 해당 부분 처리 필요

}
}