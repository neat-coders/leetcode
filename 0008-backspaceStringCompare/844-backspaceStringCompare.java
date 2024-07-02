class Solution {
    public boolean backspaceCompare(String s, String t) {
        return result(s).equals(result(t));
    }

    private String result(String s){
        Deque<Character> stack = new ArrayDeque<>();
        char c;
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if(c != '#'){
                stack.push(c);
            }else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        return stack.toString();
    }
}