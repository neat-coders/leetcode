class Solution {
    public int compress(char[] chars) {
            int index = 0;
    int count = 1;
    int n = chars.length;

    for (int i = 1; i <= n; i++) {
        if (i < n && chars[i] == chars[i - 1]) {
            count++;
        } else {
            chars[index++] = chars[i - 1];
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
            count = 1;
        }
    }

    return index;
    }
}
