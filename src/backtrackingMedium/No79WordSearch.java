package backtrackingMedium;

public class No79WordSearch {

	private static final int[][] dirs = { {0,1}, {1,0}, {0,-1}, {-1,0} };
    
    public boolean exist(char[][] board, String word) {
        if (board.length == 0 || word.length() == 0) return false;
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (exist(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean exist(char[][] board, String word, int index, int x, int y) {
        
        if (index == word.length()) return true;
        
        if(x < 0 || y < 0 || x == board.length || y == board[0].length) return false;

        char cur = board[x][y];
        if (cur != word.charAt(index)) {
            return false;
        }
        board[x][y] = '#';
        for (int[] dir : dirs) {
            if (exist(board, word, index + 1, x + dir[0], y + dir[1])) {
                board[x][y] = cur;
                return true;
            }
        }
        board[x][y] = cur;
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
