class Solution {
    public int romanToInt(String s) {
            int result = 0;
    int n = s.length();
    int prevValue = 0;

    for (int i = n - 1; i >= 0; i--) {
        int currValue = getValue(s.charAt(i));

        if (currValue >= prevValue)
            result += currValue;
        else
            result -= currValue;

        prevValue = currValue;
    }

    return result;
}

private int getValue(char c) {
    switch (c) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            throw new IllegalArgumentException("Invalid Roman numeral");
    }
    }
}
