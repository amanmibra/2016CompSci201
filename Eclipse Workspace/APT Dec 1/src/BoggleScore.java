
public class BoggleScore {
	public long bestScore(String[] grid, String[] words){
		StringBuilder sb = new StringBuilder("");
		char[][] board = twod(grid);
		return 0;
	}
	private char[][] twod(String[] grid){
		char[][] twod = new char[4][4];
		for (int r = 0; r < 4; r++){
			for(int c=0; c < 4; c++){
                twod[r][c] = grid[r].charAt(c);
            }
		}
		return twod;
	}
	private long[][] initial(char[][]board, char ch){
		long[][] scoreboard = new long[board.length][board[0].length];
		for(int i =0; i < board.length; i++){
			for(int j = 0; j < board.length; j++){
				scoreboard[i][j] = board[i][j] == ch ? 1 : 0; 
			}
		}
		return scoreboard;
	}
	public static final double MOD = 1e13;
	private long neighborsum(long[][] scoreboard, int r, int c) {
	   int[] dRow = {-1,-1,-1, 0,0, 1,1,1};
	   int[] dCol = {-1, 0, 1,-1,1,-1,0,1};
	   long sum = 0L;
	   for(int d = 0; d < dRow.length; d++){
	       int nr = r + dRow[d];
	       int nc = c + dCol[d];
	       if (nr >= 0 && nc >= 0 && nr < 4 && nc < 4){
	           sum = ((long) ((sum + scoreboard[nr][nc]) % MOD));
	       }
	   }
	   return sum;
	}
	private long[][] updateGrid(long[][] grid, char[][] board, char ch){
		assert grid.length == board.length;
		assert grid[0].length == board[0].length;
		long[][] newGrid = new long[grid.length][grid[0].length];
		for(int i = 0; i < grid.length; i++){
			for(int j = 0;j < grid[0].length; j++){
				if(board[i][j] == ch){
					newGrid[i][j] = neighborsum(grid, i, j);
				}
			}
		}
		return newGrid;
	}
}