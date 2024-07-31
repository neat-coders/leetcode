class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
         List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < matrix.length; i++) {
            int minInRow = Integer.MAX_VALUE;
            int colIndex = -1;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < minInRow) {
                    minInRow = matrix[i][j];
                    colIndex = j;
                }
            }
            boolean isMaxInCol = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][colIndex] > minInRow) {
                    isMaxInCol = false;
                    break;
                }
            }
            if (isMaxInCol) {
                result.add(minInRow);
            }
        }
        
        return result;
    }
}
