class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int n = x, reversed = 0, lastDigit = 0;
        while(n != 0){
            lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }
        return reversed == x;
    }

}