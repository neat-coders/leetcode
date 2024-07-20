class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length() == 0 )
            return true ;
        else if(s.length() != 0 && t.length() == 0 )
            return false ;
        int j = 0 ;
        for(int i = 0 ; i < t.length();i++){
            if( j < s.length() && s.charAt(j) == t.charAt(i)){
                j++;
            }
        }
        return j == s.length();

    }
}