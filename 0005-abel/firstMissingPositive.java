class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>positiveNumbers=new HashSet<>();

        for(int n:nums){
            if(n>0) positiveNumbers.add(n);
        }
        int missingSmallestPositive=1;

     
     while(positiveNumbers.contains(missingSmallestPositive)){
        missingSmallestPositive++;
     }
        
        
        return missingSmallestPositive;
    }
}