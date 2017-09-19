package DFS;

public class No529Minesweeper {

	private static final int[][] dirs = { {-1, 0}, {-1, 1}, {-1, -1}, {0, 1}, {0, -1}, {1, 1}, {1, 0}, {1, -1} };
    public char[][] updateBoard(char[][] board, int[] click) {
        int m = board.length, n = board[0].length;
        int row = click[0], col = click[1];
        
        if (board[row][col] == 'M') {
            board[row][col] = 'X';
        }
        else {
            int count = 0;
            for (int[] dir : dirs) {
                int r = row + dir[0];
                int c = col + dir[1];
                if (r < 0 || r >= m || c < 0 || c >= n) continue;
                if (board[r][c] == 'M' || board[r][c] == 'X') count++;
            }
            if (count > 0) {
                board[row][col] = (char) (count + '0'); // not just (char) count;
            } else {
                board[row][col] = 'B';  // !!!
                for (int[] dir : dirs) {
                    int r = row + dir[0];
                    int c = col + dir[1];
                    if (r < 0 || r >= m || c < 0 || c >= n) continue;
                    if (board[r][c] == 'E') {
                        updateBoard(board, new int[] {r, c});
                    }
                }
            }
        }
        return board;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
