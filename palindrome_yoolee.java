class Solution {
    public boolean isPalindrome(int x) { 

        //예외(음수)처리 먼저
        if(x < 0){
            return false;
        }

        int tmp = x;
        int reversedNum = 0;
        int lastDigit;

// x = 123
// lastDigit = 3 / 2 / 1
// reversedNum = 3 / 32 / 321
// tmp = 12 / 1 / 0

// tmp값 기준으로 while문 돌려주기
while(tmp > 0){
        lastDigit = tmp % 10;

        reversedNum = reversedNum*10 + lastDigit;
        tmp = tmp / 10;
    }
   
    // x 값을 거꾸로 만든 reversedNum이 x값과 동일한 경우 true, 아닌 경우는 false 리턴
    if(reversedNum == x){
        return true;
    }
    else{
        return false;
    }


    }

}