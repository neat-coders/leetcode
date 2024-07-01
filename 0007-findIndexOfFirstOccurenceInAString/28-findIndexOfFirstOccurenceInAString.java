class Solution {
    public int strStr(String haystack, String needle) {
         if (needle.isEmpty()) {
        return 0;
    }
    
    int haystackLen = haystack.length();
    int needleLen = needle.length();
    
    if (haystackLen < needleLen) {
        return -1;
    }
    
    for (int i = 0; i <= haystackLen - needleLen; i++) {
        int j;
        for (j = 0; j < needleLen; j++) {
            if (haystack.charAt(i + j) != needle.charAt(j)) {
                break;
            }
        }
        
        if (j == needleLen) {
            return i;
        }
    }
    
    return -1;
    }
}
