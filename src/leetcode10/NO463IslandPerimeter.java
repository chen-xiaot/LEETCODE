package leetcode10;

public class NO463IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int island=0, neighbour=0;
        
        for(int i=0;i<grid.length;i++){   //length
            for(int j=0; j<grid[i].length;j++){   //length
                if(grid[i][j]==1){
                    island++;
                    if(j+1<=grid[i].length-1 && grid[i][j+1]==1) neighbour++;
                    if(i+1<=grid.length-1 && grid[i+1][j]==1) neighbour++;
                }
            }
        }
        
        return island*4-neighbour*2;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
