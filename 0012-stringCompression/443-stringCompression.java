class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) return 1;

        int writeIndex = 0; 
        int readIndex = 0;  

        while (readIndex < chars.length) {
            char currentChar = chars[readIndex];
            int count = 0;
            while (readIndex < chars.length && chars[readIndex] == currentChar) {
                readIndex++;
                count++;
            }
            chars[writeIndex++] = currentChar;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[writeIndex++] = c;
                }
            }
        }
     
        return writeIndex;
    }
}