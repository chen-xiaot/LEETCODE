package DFS;

public class No200NumberofIslands {

	private static final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid == null) return 0;  // should check or m & n may out of boundary
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') { // character!! not integer!!
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    
    private void dfs(char[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] != '1') return;
        grid[x][y] = '0';
        
        for (int[] dir : dirs) {
            dfs(grid, x + dir[0], y + dir[1]);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
