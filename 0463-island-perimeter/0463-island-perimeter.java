class Solution {
    public int islandPerimeter(int[][] grid) {
        int sqr = 0;
        int adj = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 1)
                {
                    sqr++;
                    if(i-1 >= 0 && grid[i-1][j] == 1)
                        adj++;
                    if(j-1 >= 0 && grid[i][j-1] == 1)
                        adj++;
                }
            }          
        }
        return sqr*4 - adj*2;
    }
}