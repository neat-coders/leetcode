class Solution {
    public void rotate(int[][] matrix) {
         int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            int first = i;
            int last = n - 1 - i;
            for (int j = first; j < last; j++) {
                int offset = j - first;
                int top = matrix[first][j]; 
                matrix[first][j] = matrix[last - offset][first]; 
                matrix[last - offset][first] = matrix[last][last - offset]; 
                matrix[last][last - offset] = matrix[j][last];
                matrix[j][last] = top; 
            }
        }
    }
}
