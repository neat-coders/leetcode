class Solution {
    public int maxArea(int[] height) {
        int maxValue = 0 ;
        int i= 0 , j = height.length-1;
        while(i != j ){
            int min = height[i] < height[j] ? height[i] : height[j];
            int currentValue = (j - i ) * min ;
            if(currentValue > maxValue){
                maxValue= currentValue;
            }
            if(height[i] < height[j]){
                i++;
            }
            else {
                j--;
            }

        }

        return maxValue;
    }
}