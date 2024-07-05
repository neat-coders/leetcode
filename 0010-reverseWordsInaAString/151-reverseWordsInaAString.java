class Solution {
    public int lengthOfLastWord(String s) {
        String trimmedString = s.trim();
    int length = 0;
    int lastIndex = trimmedString.length() - 1;
    
    for (int i = lastIndex; i >= 0; i--) {
        char c = trimmedString.charAt(i);
        
        if (c == ' ') {
            break;
        } else {
            length++;
        }
    }
    
    return length;
    }
}
