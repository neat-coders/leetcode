class Solution {
    public boolean isValid(String s) {
        
    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else if (!stack.isEmpty() && isMatching(stack.peek(), c)) {
            stack.pop();
        } else {
            return false;
        }
    }

    return stack.isEmpty();
}

private boolean isMatching(char open, char close) {
    return (open == '(' && close == ')') ||
           (open == '{' && close == '}') ||
           (open == '[' && close == ']');
}
}
