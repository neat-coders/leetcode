class Solution {
    public boolean isPalindrome(int x) {
        String numberString = Integer.toString(x);
        int leftIndex = 0;
        int rightIndex = numberString.length() - 1;
        
        while (leftIndex < rightIndex) {
            if (numberString.charAt(leftIndex) != numberString.charAt(rightIndex)) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        
        return true;
    }
}
