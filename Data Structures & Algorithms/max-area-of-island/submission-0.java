class Solution {
    private static final int[][] directions = {{1, 0}, {-1, 0},
                                               {0, 1}, {0, -1}};
    public int dfs(int[][] grid,int r, int c){
        if (r < 0 || c < 0 || r >= grid.length ||
            c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }
        grid[r][c] = 0;
        int res = 1;
        for (int[] dir : directions) {
            res += dfs(grid, r + dir[0], c + dir[1]);
        }
        return res;
    }
    public int maxAreaOfIsland(int[][] grid) {
       int r = grid.length;
       int c = grid[0].length; 
       int mx=0;
       for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            if(grid[i][j]==1)
            mx = Math.max(mx,dfs(grid,i,j));
        }
       }
       return mx;
    }
}
