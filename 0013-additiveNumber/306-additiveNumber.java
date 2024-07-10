class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        
        for (int i = 1; i <= n / 2; i++) {
            if (num.charAt(0) == '0' && i > 1) return false; // 
            for (int j = i + 1; j < n; j++) {
                if (num.charAt(i) == '0' && j - i > 1) break; // 
                
                if (isValid(num, i, j)) return true;
            }
        }
        
        return false;
    }

    private boolean isValid(String num, int i, int j) {
        long num1 = Long.parseLong(num.substring(0, i));
        long num2 = Long.parseLong(num.substring(i, j));
        StringBuilder sum = new StringBuilder();
        
        for (int start = j; start < num.length(); start += sum.length()) {
            num2 = num2 + num1;
            num1 = num2 - num1;
            sum.setLength(0); 
            sum.append(num2);
            if (!num.startsWith(sum.toString(), start)) return false;
        }
        
        return true;
    }
}