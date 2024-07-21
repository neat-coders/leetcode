/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var luckyNumbers = function(matrix) {
    let m = matrix.length;
    let n = matrix[0].length;

    let minOfRow = new Array(m).fill(Infinity);
    let maxOfCol = new Array(n).fill(-Infinity);

    // Minimum element of each row
    for(let i = 0; i < m; i++) {
        for(let j = 0; j < n; j++) {
            if (matrix[i][j] < minOfRow[i]) {
                minOfRow[i] = matrix[i][j];
            }
        }
    }

    // Maximum element of each column
    for(let j = 0; j < n; j++) {
        for(let i = 0; i < m; i++) {
            if (matrix[i][j] > maxOfCol[j]) {
                maxOfCol[j] = matrix[i][j];
            }
        }
    }

    // Find common elements
    let luckyNumbers = [];
    for(let i = 0; i < m; i++) {
        for(let j = 0; j < n; j++) {
            if (matrix[i][j] === minOfRow[i] && matrix[i][j] === maxOfCol[j]) {
                luckyNumbers.push(matrix[i][j]);
            }
        }
    }
    return luckyNumbers;
};
