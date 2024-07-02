class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char c ;
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else if(c == ')' || c == ']' || c == '}'){
               if(stack.isEmpty()) return false;
                else if(c == ')'  && stack.pop() != '('){
                    return false;
                }else if(c == ']' && stack.pop() != '['){
                    return false;
                }else if(c == '}' && stack.pop() != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
