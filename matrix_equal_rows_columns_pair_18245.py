def equalPairs(grid: list[list[int]]) -> int:
    numOfPairs = 0
    numOfRows = len(grid)
    numOfCols = len(grid[0])

    for i in range(numOfRows):
        cols = [ [row[i] for row in grid] for i in range(numOfCols)]
        for j in range(len(cols)):
            if(grid[i] == cols[j]):
                numOfPairs += 1
    return numOfPairs
            


g = [[1,3,3],
     [3,5,1],
     [3,8,9]]
print(equalPairs(g))
