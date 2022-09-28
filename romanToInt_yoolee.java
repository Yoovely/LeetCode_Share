import java.util.HashMap;
import java.util.Map;
class Solution {
    public int romanToInt(String s) {

        // 1. 로마 문자에 해당하는 값을 해시맵 통해 매칭
      /*   Map<Character, Integer> map = new HashMap<>();
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
        return result; */
        // 흠.. 그런데 이 코드는 "MCMXCIV" input했을 때 마이너스 값 처리가 안되는 듯.. 해당 부분 처리 필요


        // 2. 그냥 간단하게 switch case문으로 시도
        int ans = 0, num = 0;

        for (int i = s.length()-1; i >= 0; i--) {

            switch(s.charAt(i)) {

                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;

            }

            // 여기 4*num이라는 조건을 어떻게 생각해낸거여.. 
            if (4 * num < ans) ans -= num;
            else ans += num; // 여기까지 수행한게 1턴
            // "MCMXCIV" 입력 시 
            // V: 5 break, 20 < 0 아니니까 ans = 5
            // I: 1 break, 4 < 5 맞으니까 ans = 5-1 = 4
            // C: 100 break, 400 < 4 아니니까 ans = 4+100 = 104
            // X: 10 break, 40 < 104 맞으니까 ans = 104-10 = 94
            // M: 1000 break, 4000 < 94 아니니까 ans = 94+1000 = 1094
            // C: 100 break, 400 < 1094 맞으니까 ans = 1094-100 = 994
            // M: 1000 break, 4000 < 994 아니니까 ans = 994+1000 = 1994 

        }
        
        return ans; //MCMXCIV 입력 시 1994 리턴

}
}