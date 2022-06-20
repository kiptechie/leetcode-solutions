class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(!visited[i][j] && grid[i][j] == '1') {
                    count++;
                    helper(grid,i,j,visited);
                }
            }
        }
        return count;
    }
    
     public void helper(char[][] grid, int x, int y, boolean[][] visited) {
        if(x<0 || x>=grid.length || y<0 || y>=grid[x].length || visited[x][y] || grid[x][y] == '0') {
            return;
        }
        visited[x][y] = true;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int[] dir : directions) {
            helper(grid,x+dir[0], y+dir[1], visited);
        }
    }
}