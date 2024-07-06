class Solution {
    public int lengthOfLastWord(String s) {
        char c = ' ';
        int n = 0;
        String s1 = s.stripTrailing();
        for(int i = s1.length() - 1; i>=0 && s1.charAt(i)!= ' '; i--){
            n++;
        }
        return n;
    }
}

