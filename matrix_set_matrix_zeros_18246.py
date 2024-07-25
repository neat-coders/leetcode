
# Python program for the above approach
def set_arr_zeroes(matrix: list[list[int]]) -> None:
    n, m = len(matrix), len(matrix[0])
    C0 = 1

    # Traverse the matrix and
    # mark 1st row & 1st
    # col as follows:
    for i in range(n):
        for j in range(m):
            if matrix[i][j] == 0:
                # mark i-th row:
                matrix[i][0] = 0

                # mark j-th column:
                if j == 0:
                    C0 = 0
                else:
                    matrix[0][j] = 0

    # Mark with 0 from (1,1)
    # to (n-1, m-1):
    for i in range(1, n):
        for j in range(1, m):
            if matrix[i][j] != 0:
                # Check for col & row:
                if matrix[i][0] == 0 or matrix[0][j] == 0:
                    matrix[i][j] = 0

    # Finally mark the
    # 1st row then 1st col:
    if matrix[0][0] == 0:
        for j in range(m):
            matrix[0][j] = 0
    if C0 == 0:
        for i in range(n):
            matrix[i][0] = 0

arr = [[0, 1, 2, 0],
       [3, 4, 5, 2],
       [1, 3, 1, 5]]

# Function call
set_arr_zeroes(arr)

for i in range(len(arr)):
    for j in range(len(arr[0])):
        print(arr[i][j], end=" ")
    print()
