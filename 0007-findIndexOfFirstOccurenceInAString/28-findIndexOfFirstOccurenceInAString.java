class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        if(m<n) return -1;

        
        for(int i=0;i<haystack.length();i++){
            if(i+n >m) return -1;
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}