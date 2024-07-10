class Solution {
    public boolean isAdditiveNumber(String num) {
            int n = num.length();
    
    for (int i = 1; i <= n / 2; i++) {
        if (num.charAt(0) == '0' && i > 1)
            break;
        
        long firstNum = Long.parseLong(num.substring(0, i));
        
        for (int j = 1; Math.max(i, j) <= n - i - j; j++) {
            if (num.charAt(i) == '0' && j > 1)
                break;
            
            long secondNum = Long.parseLong(num.substring(i, i + j));
            
            if (isAdditiveSequence(num, i + j, firstNum, secondNum))
                return true;
        }
    }
    
    return false;
    }
    private boolean isAdditiveSequence(String num, int start, long firstNum, long secondNum) {
    if (start == num.length())
        return true;
    
    long sum = firstNum + secondNum;
    String sumStr = Long.toString(sum);
    
    if (!num.startsWith(sumStr, start))
        return false;
    
    return isAdditiveSequence(num, start + sumStr.length(), secondNum, sum);
}
}
