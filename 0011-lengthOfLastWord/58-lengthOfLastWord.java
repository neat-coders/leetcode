class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean charOfLastWordFound = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
                charOfLastWordFound = true;
            } else if (charOfLastWordFound) {
                break;
            }
        }

        return length;
    }
}