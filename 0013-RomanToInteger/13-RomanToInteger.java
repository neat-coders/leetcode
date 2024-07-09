class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> myMap= new HashMap<>();
        int sum = 0 ; 
        int prev= 0 ; 
        myMap.put('I', 1);
        myMap.put('V', 5);
        myMap.put('X', 10);
        myMap.put('L', 50);
        myMap.put('C',100);
        myMap.put('D',500);
        myMap.put('M',1000);

        for(char c : s.toCharArray()){
            sum += myMap.get(c);
            if(prev < myMap.get(c)){
                sum = sum - 2 * prev; 
            }
            prev = myMap.get(c);
            
        }
        return sum ;


        
    }
}