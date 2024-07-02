class Solution {
    public boolean backspaceCompare(String s, String t) {
        if (s.isEmpty() && t.isEmpty())
            return true;

        return remainingStringAfterBackSpace(s).equals(remainingStringAfterBackSpace(t));
    }

    public String remainingStringAfterBackSpace(String s) {
        char backSpace = '#';
        int indexOfBackSpace = s.indexOf(backSpace);

        while (indexOfBackSpace != -1) {
            if (indexOfBackSpace > 0) {
                s = s.substring(0, indexOfBackSpace - 1) + s.substring(indexOfBackSpace + 1);
            } else {
                s = s.substring(indexOfBackSpace + 1);
            }
            indexOfBackSpace = s.indexOf(backSpace);

        }
        return s;
    }
}
