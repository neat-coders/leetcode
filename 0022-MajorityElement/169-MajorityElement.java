import java.util.Hashtable;

class Solution {
    public int majorityElement(int[] nums) {
        Hashtable<Integer, Integer> myMap = new Hashtable<>();
        for(int n : nums){
            myMap.put(n,myMap.getOrDefault(n, 0 ) + 1 );

        }
        int max = 0;
        int  result = nums[0] ;
        for(int i : myMap.keySet()){
            if(myMap.get(i) > max){
                max= myMap.get(i);
                result= i;
            }

        }
        return result;
    }
}