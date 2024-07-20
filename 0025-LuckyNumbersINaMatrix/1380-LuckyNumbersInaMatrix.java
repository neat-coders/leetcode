class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> myLuckyNumbers = new ArrayList<>();
        for(int i = 0 ; i < matrix.length;i++){
            int minElement = matrix[i][0];
            int minIndex = 0 ;
            for(int j = 0 ; j < matrix[i].length;j++){
                if(matrix[i][j] < minElement ){
                    minElement = matrix[i][j];
                    minIndex = j ;
                }
            }

            boolean isLucky = true ;
            for(int k = 0 ; k  <matrix.length;k++){
                if(matrix[k][minIndex] > minElement){
                    isLucky = false ;
                    break;
                }
            }
            if(isLucky){
                myLuckyNumbers.add(minElement);
            }

        }

        return myLuckyNumbers;
        

    }

}