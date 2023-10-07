class Solution:
    def rotate(self, matrix: list[list[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        for x in range(len(matrix)):
            for y in range(x,len(matrix)):
                matrix[x][y], matrix[y][x] = matrix[y][x], matrix[x][y]
        for x in range(len(matrix)):
            i = -1
            for y in range(int(len(matrix)/2)):
                matrix[x][y], matrix[x][i] = matrix[x][i], matrix[x][y]
                i-=1