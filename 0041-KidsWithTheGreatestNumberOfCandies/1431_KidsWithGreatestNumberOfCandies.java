class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> myArray = new ArrayList<>();
        // 1- first get the maximum number in the kids
        int maxNumber = candies[0];
        for(int i = 1 ; i  < candies.length; i++){
            if(candies[i] > maxNumber){
                maxNumber = candies[i];
            }
        }

        // 2- iterating the array for comparing each kid ( after adding the extraCandies) to the Maximum
        // we got from the first step.


        for(int i = 0 ; i < candies.length ; i++){
            int temp = candies[i] + extraCandies;
            if(temp >= maxNumber){
                myArray.add(true);
            }
            else
                myArray.add(false) ;
        }



        // return the boolean array.



        return myArray;
    }
}