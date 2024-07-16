class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < words.length; i++){
            String xStr = Character.toString(x);
            if(words[i].contains(xStr))
                result.add(i);
        }

        return result;

    }
}