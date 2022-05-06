public class Question02 {
    /*
    Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water), return the number of islands.
    An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
    You may assume all four edges of the grid are all surrounded by water.
     */
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        int nums = 0;
        for (int i = 0; i < grid.length ; i++){
            for(int j = 0; j < grid[0].length ;j++){
                if (grid[i][j] == '1'){
                    dfs(grid, i, j);
                    nums++;
                }
            }
        }
        return nums;
    }
    private void dfs(char[][] grid,int x, int y){
        if (grid[x][y] != '1')
            return;
        grid[x][y] = '2';
        if (x+1 <= grid.length - 1)
            dfs(grid,x+1,y);
        if (x-1 >= 0)
            dfs(grid,x-1,y);
        if (y+1 <= grid[0].length -1 )
            dfs(grid,x,y+1);
        if(y-1 >=0 )
            dfs(grid,x,y-1);
        return;
    }
}

