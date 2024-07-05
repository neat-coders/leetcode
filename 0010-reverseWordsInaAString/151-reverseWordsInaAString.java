class Solution {

    public String reverseWords(String s) {
    int length = s.length();
    List<String> listOfWords = new ArrayList<>();
    StringBuilder word = new StringBuilder();
    boolean lastWasSpace = true;  
    for (int i = 0; i < length; i++) {
        char c = s.charAt(i);
        
        if (c != ' ') {
            word.append(c);
            lastWasSpace = false;
        } else if (!lastWasSpace) {
            listOfWords.add(word.toString());
            word.setLength(0);  
            lastWasSpace = true;
        }
    }
    
    
    if (!lastWasSpace) {
        listOfWords.add(word.toString());
    } 
    Collections.reverse(listOfWords);
    return String.join(" ", listOfWords);
}
}