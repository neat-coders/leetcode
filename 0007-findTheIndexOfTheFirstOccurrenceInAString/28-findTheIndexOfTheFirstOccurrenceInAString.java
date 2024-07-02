class Solution {
    public int strStr(String haystack, String needle) {
        int hLength = haystack.length(), nLength = needle.length(); 
        if(nLength > hLength) return -1;
        for(int i = 0 ; i + nLength <= hLength; i++ ){
            if( haystack.substring(i, i + nLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}