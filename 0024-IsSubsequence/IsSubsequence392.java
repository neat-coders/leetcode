class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        
        for (int i = 0; i < t.length() && sPointer < s.length(); i++) {
            if (s.charAt(sPointer) == t.charAt(i)) {
                sPointer++;
            }
        }
        
        return sPointer == s.length();
    }
}
