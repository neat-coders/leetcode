class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        int sPtr = s.length() - 1;
    int tPtr = t.length() - 1;
    int sSkip = 0;
    int tSkip = 0;

    while (sPtr >= 0 || tPtr >= 0) {
        while (sPtr >= 0 && (s.charAt(sPtr) == '#' || sSkip > 0)) {
            if (s.charAt(sPtr) == '#') {
                sSkip++;
            } else {
                sSkip--;
            }
            sPtr--;
        }

        while (tPtr >= 0 && (t.charAt(tPtr) == '#' || tSkip > 0)) {
            if (t.charAt(tPtr) == '#') {
                tSkip++;
            } else {
                tSkip--;
            }
            tPtr--;
        }

        if (sPtr >= 0 && tPtr >= 0 && s.charAt(sPtr) != t.charAt(tPtr)) {
            return false;
        }

        if ((sPtr >= 0) != (tPtr >= 0)) {
            return false;
        }

        sPtr--;
        tPtr--;
    }

    return true;
    }
}
