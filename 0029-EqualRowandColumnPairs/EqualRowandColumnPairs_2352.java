class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
    int count = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (Arrays.equals(grid[i], getColumn(grid, j))) {
                count++;
            }
        }
    }

    return count;
}

private int[] getColumn(int[][] grid, int j) {
    int[] column = new int[grid.length];
    for (int i = 0; i < grid.length; i++) {
        column[i] = grid[i][j];
    }
    return column;
    }
}
