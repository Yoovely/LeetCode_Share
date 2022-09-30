class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);
        int l = 0;
        int r = str.length();
        int m = (l+r)/2;
        for(int i=l; i<m; i++) {
            char leftChar = str.charAt(i);
            char rightChar = str.charAt(r-1-i);
            if(leftChar != rightChar) {
                return false;
            }
        }
        
        return true;
        
    }
}
